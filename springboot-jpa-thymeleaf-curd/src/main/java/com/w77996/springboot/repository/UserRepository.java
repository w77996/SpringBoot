package com.w77996.springboot.repository;

import com.w77996.springboot.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    @Override
    List<User> findAll();

    @Override
    User findOne(Long aLong);

    @Override
    void delete(Long aLong);


}
