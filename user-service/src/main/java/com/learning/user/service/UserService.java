package com.learning.user.service;

import com.learning.user.VO.Department;
import com.learning.user.VO.TemplateResponseVO;
import com.learning.user.entity.User;
import com.learning.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("Save User Service");
        return repository.save(user);
    }

    public TemplateResponseVO getUserWithDepartment(Long userId) {
        log.info("Get User Service");

        TemplateResponseVO vo = new TemplateResponseVO();
        User user = repository.findByUserId(userId);

        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" +
                user.getDepartmentId(), Department.class);

        vo.setUser(user);
        vo.setDepartment(department);

        return vo;
    }
}
