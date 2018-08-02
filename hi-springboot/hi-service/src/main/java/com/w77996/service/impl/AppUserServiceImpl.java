package com.w77996.service.impl;


import com.w77996.dao.AppUserDao;
import com.w77996.entity.AppUser;
import com.w77996.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: hi-springboot
 * @description:
 * @author: w77996
 * @create: 2018-07-11 14:11
 */
@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    AppUserDao appUserDao;

    @Override
    public AppUser selectAllUser() {
        return appUserDao.selectAllUser();
    }
}