package com.w77996.springbootelasticsearch.controller;

import com.w77996.springbootelasticsearch.bean.Media;
import com.w77996.springbootelasticsearch.es.MediaSearchRepository;
import com.w77996.springbootelasticsearch.service.MediaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: spring-boot-elasticsearch
 * @description:
 * @author: w77996
 * @create: 2018-07-09 19:24
 */
@RestController
@Slf4j
public class EsController {

    @Autowired
    private MediaSearchRepository mediaSearchRepository;

    @Autowired
    private MediaService mediaService;
    @GetMapping("/add")
    public void esAdd(){
        List<Media> list = mediaService.selectPublishMedias();
        log.info(list.size()+"");
        mediaSearchRepository.save(list);

    }
}