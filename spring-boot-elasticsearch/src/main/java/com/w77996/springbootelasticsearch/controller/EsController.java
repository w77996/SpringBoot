package com.w77996.springbootelasticsearch.controller;

import com.w77996.springbootelasticsearch.bean.Media;
import com.w77996.springbootelasticsearch.es.MediaSearchRepository;
import com.w77996.springbootelasticsearch.service.MediaService;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.elasticsearch.index.query.QueryBuilders.queryStringQuery;

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
    private ElasticsearchTemplate elasticsearchTemplate;


    @Autowired
    private MediaService mediaService;
    @GetMapping("/add")
    public void esAdd(){
        List<Media> list = mediaService.selectPublishMedias();
        log.info(list.size()+"");
        mediaSearchRepository.save(list);

    }

    @GetMapping("/get")
    @ResponseBody
    public Object es(String word){
        QueryBuilder builder = QueryBuilders.boolQuery()
                .should(QueryBuilders.matchPhraseQuery("title","区块链"))
                .should(QueryBuilders.matchPhraseQuery("editor","区块链"))
                .should(QueryBuilders.matchPhraseQuery("articleSummary","区块链"))
                .should(QueryBuilders.matchPhraseQuery("tags","区块链"));


        log.info(builder.toString());
        //按照年龄从高到低
            FieldSortBuilder sort = SortBuilders.fieldSort("id").order(SortOrder.DESC);
        //注意!es的分页api是从第0页开始的(坑)
        PageRequest pageRequest = new PageRequest(0, 10);
        //构建查询
        NativeSearchQuery query = new NativeSearchQueryBuilder()
                .withQuery(builder)
                .withPageable(pageRequest)
                    .withSort(sort)
                .build();
        log.info(query.toString());
        //执行
        Page<Media> search = mediaSearchRepository.search(query);
        //获取总条数(前端分页需要使用)
        Integer total = (int) search.getTotalElements();
        log.info("total "+total);
        return null;
    }
}