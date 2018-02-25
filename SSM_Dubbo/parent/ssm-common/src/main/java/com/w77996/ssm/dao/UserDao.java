package com.w77996.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.w77996.ssm.bean.User;

//@Repository
public interface UserDao {

    User selectUserById(@Param("userId") Long userId);

    User selectUserByPhoneOrEmail(@Param("emailOrPhone") String emailOrPhone, @Param("state") Short state);

    List<User> selectAllUser();
}
