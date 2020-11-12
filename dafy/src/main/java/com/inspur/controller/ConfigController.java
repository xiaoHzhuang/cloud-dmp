package com.inspur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Value("${my.username}")
    private String userName;
    @Autowired
    private Environment environment;

    @RequestMapping("pringMsg")
    public void printMsg() {
        System.out.println(userName);
        System.out.println(environment.getProperty("my.username"));
    }
}
