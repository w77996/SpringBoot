package com.w77996.springbootelasticsearch.es;

import com.w77996.springbootelasticsearch.bean.Media;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @program: spring-boot-elasticsearch
 * @description:
 * @author: w77996
 * @create: 2018-07-09 19:21
 */
public interface MediaSearchRepository  extends ElasticsearchRepository<Media,Integer> {
}