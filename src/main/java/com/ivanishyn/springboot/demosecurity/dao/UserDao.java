package com.ivanishyn.springboot.demosecurity.dao;

import com.ivanishyn.springboot.demosecurity.entity.User;

public interface UserDao {

    User findByUserName(String userName);

    void save(User theUser);
}
