package com.inspur.service;

import com.inspur.VO.Student;
import com.inspur.service.impl.StudentServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "DASX", path = "/inpsur", fallbackFactory = StudentServiceFallbackFactory.class)
public interface IStudentService {

    @GetMapping("getStudentById")
    Student getStudentById(@RequestParam("id") Integer id);
}
