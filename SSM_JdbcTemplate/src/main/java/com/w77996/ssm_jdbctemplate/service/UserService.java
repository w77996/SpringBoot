package com.w77996.ssm_jdbctemplate.service;


import com.w77996.ssm_jdbctemplate.entity.User;
import com.w77996.ssm_jdbctemplate.utils.PageParam;
import com.w77996.ssm_jdbctemplate.utils.Pagination;

import java.util.List;

public interface UserService {


    List<User> getAllUser();

    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

    User getUserById(Long userId);

    boolean inserUser(String username,String phone,String email,String user_pwd);

    boolean updateUser(String username,String phone,String email,String user_pwd);

    Pagination<User> find(Long user_id,PageParam pageParam);
}
