package com.earthchen.spring.boot.service.impl;

import com.earthchen.spring.boot.dao.UserDao;
import com.earthchen.spring.boot.domain.User;
import com.earthchen.spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: EarthChen
 * @date: 2018/04/16
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.selectAll();
    }
}
