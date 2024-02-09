package com.interview.Test.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String empName;
    private int empSalary;

    public void employeeActivity(){
        System.out.println("Employee is doing work from home");
    }
}
