package com.inspur.controller;

import com.inspur.VO.Student;
import com.inspur.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private IStudentService studentService;

    @RequestMapping("student/query/{id}")
    public Student getStudentById(@PathVariable("id") Integer id) {
        return studentService.getStudentById(id);
    }
}
