package com.inspur.controller;

import com.inspur.service.IUserService;
import com.inspur.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private IUserService userServiceImpl;

    public static boolean canVisitDb = true;
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("queryUser")
    public String queryUser() {
        logger.info("当前线程为：" + Thread.currentThread().getName());
        return userServiceImpl.queryUser();
    }
}
