package com.w77996.controller;

import com.w77996.service.AppUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: hi-springboot
 * @description: 测试整合
 * @author: w77996
 * @create: 2018-08-01 15:46
 */
@RestController
@Slf4j
public class WebController {

    @Autowired
    private AppUserService appUserService;
    @GetMapping("/")
    public String hell(){
        return "hello";
    }

    @GetMapping("/user")
    public void user(){
        log.info(appUserService.selectAllUser().toString());
    }
}