package com.inspur.controller;

import com.inspur.VO.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    @RequestMapping("inpsur/getStudentById")
    public Student getStudentById(@RequestParam("id") Integer id) {
        Student student = new Student();
        student.setStudentId("1");
        student.setStudentName("李ID额");
        int a=1/0;
        return student;
    }
}
