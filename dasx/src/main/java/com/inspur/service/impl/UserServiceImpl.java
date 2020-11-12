package com.inspur.service.impl;

import com.inspur.service.IUserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @HystrixCommand(fallbackMethod = "queryUserFallBack", commandProperties = {
            @HystrixProperty(name = "execution.isolation.strategy", value = "THREAD"),
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000000000")
    },
            threadPoolKey = "queryContentshystrixJackpool", threadPoolProperties = {
            @HystrixProperty(name = "coreSize", value = "10")
    })
    @Override
    public String queryUser() {
        logger.info("当前线程为：" + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "========micro-order===queryUser";
    }

    public String queryUserFallBack() {
        logger.info("服务降级");
        return "服务降级";
    }
}
