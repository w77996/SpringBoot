package com.w77996.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-docker
 * @description:
 * @author: w77996
 * @create: 2018-07-25 18:31
 */
@RestController
public class DockerController {

    @GetMapping("/docker")
    public  String docker(){
        return "docker 8020 -1";
    }
}