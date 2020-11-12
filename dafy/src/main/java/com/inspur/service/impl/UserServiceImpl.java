package com.inspur.service.impl;

import com.inspur.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements IUserService {
    public static final String SERVIER_NAME = "DASX";
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String queryContents() {
        String results = restTemplate.getForObject("http://"
                + SERVIER_NAME + "/queryUser", String.class);
        return results;
    }
}
