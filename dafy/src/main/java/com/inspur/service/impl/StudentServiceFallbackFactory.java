package com.inspur.service.impl;

import com.inspur.VO.Student;
import com.inspur.service.IStudentService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceFallbackFactory implements FallbackFactory<IStudentService> {
    @Override
    public IStudentService create(Throwable throwable) {
        String msg = throwable.getMessage();
        System.out.println(msg);
        return new IStudentService() {
            @Override
            public Student getStudentById(Integer id) {
                Student student = new Student();
                student.setStudentId("error");
                student.setStudentName("错误");
                return student;
            }
        };
    }
}
