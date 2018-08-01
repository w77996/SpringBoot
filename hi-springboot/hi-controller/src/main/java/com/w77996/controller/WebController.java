package com.w77996.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: hi-springboot
 * @description: 测试整合
 * @author: w77996
 * @create: 2018-08-01 15:46
 */
@RestController
public class WebController {

    @GetMapping("/")
    public String hell(){
        return "hello";
    }
}