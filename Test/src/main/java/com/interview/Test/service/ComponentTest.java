package com.interview.Test.service;

import com.interview.Test.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ComponentTest {

    @Bean
    public Student getStudentObject(){
        return  new Student();
    }
}
