package com.project.department.controller;

import com.project.department.entity.Department;
import com.project.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController  {

    @Autowired
    private DepartmentService departmentService;
    @Autowired
    ApplicationClass applicationClass;
    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
    log.info("Inside saveDepartment method of Department Controller");
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Inside findDepartmentById method of Department Controller");
        return departmentService.findDepartmentById(departmentId);
    }

    @GetMapping("/")
    public List<Department> findAllDept(){
        log.info("Inside findAllDept() method of Department Controller");
        return departmentService.findAll();
    }

    @GetMapping("/test")
    public Map<String, Integer> getProperties(){
        //int a=1/0;
        log.info("Inside getProperties method of Department Controller : "+applicationClass.applicationTest);
       return applicationClass.hashMap;
    }

    //@ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleExceptionMethhod(){
        log.info("@ExceptionHandler annotation example");
    }

}
