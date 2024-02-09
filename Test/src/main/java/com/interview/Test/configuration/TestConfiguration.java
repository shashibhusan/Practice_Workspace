package com.interview.Test.configuration;

import com.interview.Test.pojo.Employee;
import com.interview.Test.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {
    @Bean
    public Employee getEmployeeObject(){
        return new Employee();
    }
    public void configMethod(){
        System.out.println("This is the config method");
    }
}
