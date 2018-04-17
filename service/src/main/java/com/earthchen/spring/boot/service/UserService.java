package com.earthchen.spring.boot.service;

import com.earthchen.spring.boot.domain.User;

import java.util.List;

/**
 * @author: EarthChen
 * @date: 2018/04/16
 */

public interface UserService {


    List<User> getUserList();
}
