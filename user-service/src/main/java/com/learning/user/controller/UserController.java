package com.learning.user.controller;

import com.learning.user.VO.TemplateResponseVO;
import com.learning.user.entity.User;
import com.learning.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Save User Controller");
        return service.saveUser(user);
    }

    @GetMapping("/{id}")
    public TemplateResponseVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("Save User Service");
        return service.getUserWithDepartment(userId);
    }
}
