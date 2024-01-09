package com.project.user.service;

import com.project.user.VO.Department;
import com.project.user.VO.ResponseTemplateVO;
import com.project.user.entity.User;
import com.project.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;
    public User saveUser(User user){
        log.info("Inside method saveUser of user Service");
        return userRepository.save(user);
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        log.info("Inside method getUserWithDepartment of user Service");
        ResponseTemplateVO responseTemplateVO=new ResponseTemplateVO();
        User user=userRepository.findById(userId).orElse(new User(1L,"test","test","abs",1L));
        Department department=restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getUserId(),Department.class);
        responseTemplateVO.setUser(user);
        responseTemplateVO.setDepartment(department);
        return responseTemplateVO;
    }
}
