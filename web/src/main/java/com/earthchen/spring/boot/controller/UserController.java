package com.earthchen.spring.boot.controller;

import com.earthchen.spring.boot.domain.User;
import com.earthchen.spring.boot.form.UserForm;
import com.earthchen.spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * user控制器
 *
 * @author: EarthChen
 * @date: 2018/04/16
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public Object userList() {
        return userService.getUserList();
    }

    @PostMapping("/test")
    public Object test(@Valid UserForm userForm){
        return userForm;
    }
}
