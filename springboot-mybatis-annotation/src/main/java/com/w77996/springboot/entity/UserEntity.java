package com.w77996.springboot.entity;

import com.w77996.springboot.enums.UserSexEnums;

import java.io.Serializable;

public class UserEntity implements Serializable{

    private Long id;
    private String userName;
    private String passWord;
    private UserSexEnums userSex;
    private String nickName;

    public UserEntity() {
    }

    public UserEntity(String userName, String password, UserSexEnums userSex) {
        this.userName = userName;
        this.passWord = password;
        this.userSex = userSex;
    }

    public UserEntity(Long id, String userName, String password, UserSexEnums userSex, String nickName) {
        this.id = id;
        this.userName = userName;
        this.passWord = password;
        this.userSex = userSex;
        this.nickName = nickName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public UserSexEnums getUserSex() {
        return userSex;
    }

    public void setUserSex(UserSexEnums userSex) {
        this.userSex = userSex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
