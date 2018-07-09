package com.w77996.springbootelasticsearch.bean;

import lombok.Data;

import java.util.List;

@Data
public class Media {
    private Integer id;

    private Integer type;

    private String desp;

    private Integer viewNum;

    private Integer trueViewNum;

    private Integer isSendtoxzh;

    private Integer isSendtoxzhHistory;
//    @NotNull
//    @Digits(integer = 1,fraction = 0)
    private Integer isHot;
    /*@NotNull
    @Digits(integer = 1,fraction = 0)*/
    private Integer isPush;
//    @NotNull
//    @Digits(integer = 1,fraction = 0)
    private Integer isStick;

    private String stickEndtime;

    private String deletedAt;

    private String createdAt;

    private String updatedAt;

    private String updatedTime;
//    @NotNull
//    @Digits(integer = 1,fraction = 0)
    private Integer status;

    private String title;

    private Integer editorId;

    private String editor;

    private String imageUrl;
//    @NotNull
    private String articleTitle;

    private String articleContent;

    private String articleSummary;
//    @NotNull
//    @Digits(integer = 1,fraction = 0)
    private Integer originalType;

    private String sourceName;

    private String sourceUrl;

    private String publishTime;

    private Integer authorId;



}