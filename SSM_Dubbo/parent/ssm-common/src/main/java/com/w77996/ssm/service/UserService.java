package com.w77996.ssm.service;

import java.util.List;

import com.w77996.ssm.bean.User;

public interface UserService {
	  List<User> getAllUser();

	    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

	    User getUserById(Long userId);
}
