package com.project.department.service;

import com.project.department.entity.Department;
import com.project.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentService  {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Value("${server.port}")
    private String serverPort;
    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of DepartmentService on port "+serverPort);
        return departmentRepository.save(department);
    }

    public List<Department> findAll() {
        log.info("Inside findAll() method of DepartmentService ");
        return departmentRepository.findAll();
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentById method of DepartmentService "+serverPort);
        return departmentRepository.findById(departmentId).orElse(new Department(1L,"111","111","111"));
    }
}
