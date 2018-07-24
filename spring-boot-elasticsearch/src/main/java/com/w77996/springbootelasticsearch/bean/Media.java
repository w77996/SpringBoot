package com.w77996.springbootelasticsearch.bean;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.List;

/**
 *
 * @author w77996
 */
@Data
@Document(indexName = "es",type = "meida",indexStoreType="fs",shards=5,replicas=1,refreshInterval="-1")
public class Media {
    private Integer id;

    private Integer type;

    private String desp;

    private Integer viewNum;

    private Integer trueViewNum;

    private Integer isSendtoxzh;

    private Integer isSendtoxzhHistory;

    private Integer isHot;

    private Integer isPush;

    private Integer isStick;

    private String stickEndtime;

    private String deletedAt;

    private String createdAt;

    private String updatedAt;

    private String updatedTime;

    private Integer status;

    private String title;

    private Integer editorId;

    private String editor;

    private String imageUrl;

    private String articleTitle;

    private String articleContent;

    private String articleSummary;

    private Integer originalType;

    private String sourceName;

    private String sourceUrl;

    private String publishTime;

    private Integer authorId;
}