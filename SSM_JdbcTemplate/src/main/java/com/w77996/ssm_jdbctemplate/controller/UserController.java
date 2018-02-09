package com.w77996.ssm_jdbctemplate.controller;

import com.w77996.ssm_jdbctemplate.dto.HttpBaseDto;
import com.w77996.ssm_jdbctemplate.entity.User;
import com.w77996.ssm_jdbctemplate.exception.BizException;
import com.w77996.ssm_jdbctemplate.service.UserService;
import com.w77996.ssm_jdbctemplate.utils.PageParam;
import com.w77996.ssm_jdbctemplate.utils.Pagination;
import com.w77996.ssm_jdbctemplate.utils.RespCode;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private UserService userService;


    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        logger.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);
        return "showUser";
    }

    @ResponseBody
    @RequestMapping("/getAllUser")
    public HttpBaseDto getAllUser(){
        List<User> list = userService.getAllUser();
        if(list != null && list.size() > 0){
            HttpBaseDto dto = new HttpBaseDto();
            dto.setData(list);
            return dto;
        }else{
            throw  new BizException(RespCode.ERR_PARAM);
        }
    }

    @ResponseBody
    @RequestMapping("listUser")
    public HttpBaseDto listUser(@RequestParam Long user_id,@RequestParam Integer page){
        PageParam pageParam = new PageParam();
        if(page != null && page > 0 ){
            pageParam.setPage(page.intValue());
        }
        pageParam.setSort("create_time");
        Pagination<User> pagination = userService.find(user_id,pageParam);
        List<Map<String, Object>> dataList = new LinkedList<Map<String, Object>>();
        HttpBaseDto dto = new HttpBaseDto();
        if (pagination.getResultList() != null) {
            for (User row : pagination.getResultList()) {
                Map<String, Object> rowMap = new HashMap<>();
                rowMap.put("username", row.getUserName());
                dataList.add(rowMap);
            }
        }
        dto.setPageData(pagination, dataList);
        return dto;
    }

    @ResponseBody
    @RequestMapping("/insertUser")
    public HttpBaseDto insertUser(String username,String phone,String email,String user_pwd){
        if(StringUtils.isAnyEmpty(username,phone,email,user_pwd)){
            throw  new BizException(RespCode.NOTEXIST_PARAM);
        }
        if(userService.inserUser(username,phone,email,user_pwd)){
            HttpBaseDto httpBaseDto = new HttpBaseDto();
            return httpBaseDto;
        }else{
            logger.info("插入用户数据，username:" + username + ",phone:" + phone + ",email:" + email + ",user_pwd:" + user_pwd);
            throw new BizException(RespCode.SYS_ERR);
        }
    }
    @ResponseBody
    @RequestMapping("updateUser")
    public HttpBaseDto updateUser(String username,String phone,String email,String user_pwd){
        if(StringUtils.isAnyEmpty(username,phone,email,user_pwd)){
            throw  new BizException(RespCode.NOTEXIST_PARAM);
        }
        if(userService.updateUser(username,phone,email,user_pwd)){
            HttpBaseDto httpBaseDto = new HttpBaseDto();
            return httpBaseDto;
        }else{
            logger.info("更新用户数据，发生数据库失败, username:" + username + ",phone:" + phone + ",email:" + email + ",user_pwd:" + user_pwd);
            throw new BizException(RespCode.SYS_ERR);
        }
    }
}