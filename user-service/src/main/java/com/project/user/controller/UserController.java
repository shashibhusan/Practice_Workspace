package com.project.user.controller;

import com.project.user.VO.Department;
import com.project.user.VO.ResponseTemplateVO;
import com.project.user.entity.User;
import com.project.user.service.UserService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;


@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    public static final String MISROSERVICE_BASE_URL = "http://DEPARTMENT-SERVICE";
    @Autowired
    private UserService userService;
    @Autowired
    WebClient webClient;
    @Autowired
    WebClient.Builder webClientBuilder;
    public static final String USER_SERVICE="user-Service";
    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info(" In side method saveUser of userController");
        return userService.saveUser(user);
    }

    @GetMapping("/")
    public List<User> getAll(){
        log.info(" In side method getAll() of userController");
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    @CircuitBreaker(name = USER_SERVICE, fallbackMethod = "getDefaultData")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info(" In side method getUserWithDepartment of userController");
        return userService.getUserWithDepartment(userId);
    }
    public ResponseTemplateVO getDefaultData(Exception e){
        log.info(" This is the fallback method");
        User user=new User(1L,"shashi","Bhusan","abc@gmail.com",001L);
        Department department=new Department(001l,"name","address","code");
        ResponseTemplateVO responseTemplateVO=new ResponseTemplateVO(user,department);
        return responseTemplateVO;
    }

    // Calling the service by passing gateway/load balancer url
    @GetMapping("test/{id}")
    public Department getDepartment(@PathVariable("id") Long deptId){
        log.info("****Inside method getDepartment of UserController*****");
        Department department = webClient.get()
                .uri("departments/{id}", deptId)
                .retrieve().bodyToMono(Department.class)
                .block();
        return department;
    }

    // Calling the service by passing service url
    @GetMapping("newTest/{id}")
    public Department getDepartmentNew(@PathVariable("id") Long deptId){
        log.info("****Inside method getDepartmentNew of UserController*****");
        Department department = webClientBuilder.build().get().uri
                        (MISROSERVICE_BASE_URL + "/departments/" + deptId)
                .retrieve().bodyToMono(Department.class).block();
        return department;
    }

    // Flux example
    @GetMapping("flux/")
    public List<Department> fluxExample(){
        log.info("****Inside method fluxExample() of UserController*****");
        List<Department> departmentList = webClient.get()
                .uri("departments/")
                .retrieve().bodyToFlux(Department.class).
                collectList().block();
        return departmentList;
    }

    // WebClient Post Example
    @PostMapping("fluxPost/")
    public  Department fluxPostExample(){
        log.info("****Inside method fluxPostExample() of UserController*****");
        Department department = webClient.post()
                .uri("departments/")
                .bodyValue(getDepartment())
                .retrieve().bodyToMono(Department.class).block();
        return department;
    }

    private Department getDepartment(){
        Department department=new Department();
        department.setDepartmentAddress("Ballia");
        department.setDepartmentCode("DepartmentCode");
        department.setDepartmentName("Traffic Department");
        return department;
    }

}
