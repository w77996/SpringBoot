package com.w77996.springbootjsr003.controller;

import com.w77996.springbootjsr003.result.Result;
import com.w77996.springbootjsr003.vo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
@Slf4j
public class ValidatorController {

    @RequestMapping("/do_login")
    @ResponseBody
    public Result<String> doLogin(HttpServletResponse response, @Valid User loginVo) {
        log.info(loginVo.toString());
        //登录
      //  String token = userService.login(response, loginVo);
        return Result.success("666");
    }
}
