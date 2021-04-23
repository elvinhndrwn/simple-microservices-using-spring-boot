package com.learning.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("userServiceFallBack")
    public String userServiceFallBackMethod(){
        return "User is taking longer than expected, try again!";
    }

    @GetMapping("departmentServiceFallBack")
    public String departmentServiceFallBackMethod(){
        return "Dept is taking longer than expected, try again!";
    }
}
