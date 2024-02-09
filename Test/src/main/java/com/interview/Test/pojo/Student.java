package com.interview.Test.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private int age;

    public void studentActivity(){
        System.out.println("Student is reading");
    }
}
