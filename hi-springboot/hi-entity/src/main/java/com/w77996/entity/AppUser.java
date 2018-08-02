package com.w77996.entity;



import lombok.Data;

import java.util.Date;


@Data
public class AppUser {
    private Integer id;

    private String nickname;

    private String username;

    private Integer flag;

    private String password;

    private Integer sex;

    private String deletedAt;

    private Date createdAt;

    private Date updatedAt;

    private String phone;

    private String email;

    private String nation;

    private String headImage;

    private Integer platform;

    private String openid;

    private String uuid;

    private String region;

    private String firstEquip;

    private String unionid;

    private String selfIntro;


}