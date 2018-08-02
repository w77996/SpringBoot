package com.w77996;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: hi-springboot
 * @description: controller启动项
 * @author: w77996
 * @create: 2018-08-01 15:40
 */
@SpringBootApplication
@MapperScan("com.w77996.dao")
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}