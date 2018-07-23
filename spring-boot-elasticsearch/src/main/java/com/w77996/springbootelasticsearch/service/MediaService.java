package com.w77996.springbootelasticsearch.service;

import com.w77996.springbootelasticsearch.bean.Media;

import java.util.List;

/**
 * @program: spring-boot-elasticsearch
 * @description:
 * @author: w77996
 * @create: 2018-07-23 14:49
 */
public interface MediaService {

    List<Media> selectPublishMedias();
}