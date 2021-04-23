package com.learning.department.service;

import com.learning.department.entity.Department;
import com.learning.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public Department saveDepartment(Department department) {
        log.info("Save Department Service");
        return repository.save(department);
    }


    public Department findDepartmentById(Long departmentId) {
        log.info("Find Department By Id Service");
        return repository.findByDepartmentId(departmentId);
    }
}
