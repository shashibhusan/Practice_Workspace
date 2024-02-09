package com.interview.Test.controller;

import com.interview.Test.configuration.TestConfiguration;
import com.interview.Test.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Repository
@RequestMapping(value = "/Hello")
public class TestController {
    @Autowired
    TestConfiguration testConfiguration;

    @Autowired
    Student student;

    @GetMapping(value = "/test")
    public String test(){
        System.out.println("Calling the test method of the Controller");
        testConfiguration.configMethod();
        student.studentActivity();
        return "Hello world";
    }
}
