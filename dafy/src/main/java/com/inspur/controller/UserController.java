package com.inspur.controller;

import com.inspur.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private IUserService userServiceImpl;

    @RequestMapping("queryUser")
    public String queryUser() {
        return userServiceImpl.queryContents();
    }
}
