package com.inspur;

import com.inspur.service.IStudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(clients = {IStudentService.class})
public class DafyApplication {
    public static void main(String[] args) {
        SpringApplication.run(DafyApplication.class, args);
    }
}
