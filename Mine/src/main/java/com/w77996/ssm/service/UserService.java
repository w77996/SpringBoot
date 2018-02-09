package com.w77996.ssm.service;

import com.w77996.ssm.entity.User;

import java.util.List;

public interface UserService {


    List<User> getAllUser();

    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

    User getUserById(Long userId);
}
