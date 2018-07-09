package com.w77996.springbootelasticsearch.controller;

import com.w77996.springbootelasticsearch.dao.MediaSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-boot-elasticsearch
 * @description:
 * @author: w77996
 * @create: 2018-07-09 19:24
 */
@RestController
public class EsController {

    @Autowired
    private MediaSearchRepository mediaSearchRepository;

    @RequestMapping("/add")
    public void esAdd(){

    }
}