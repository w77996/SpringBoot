package com.w77996.springbootelasticsearch.service.impl;

import com.w77996.springbootelasticsearch.bean.Media;
import com.w77996.springbootelasticsearch.mapper.MediaMapper;
import com.w77996.springbootelasticsearch.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: spring-boot-elasticsearch
 * @description:
 * @author: w77996
 * @create: 2018-07-23 14:49
 */
@Service
public class MediaServiceImpl implements MediaService {

    @Autowired
    private MediaMapper mediaMapper;

    @Override
    public List<Media> selectPublishMedias() {
        return mediaMapper.selectPublishMedias();
    }
}