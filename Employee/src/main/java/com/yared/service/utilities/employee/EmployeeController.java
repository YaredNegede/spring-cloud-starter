package com.yared.service.utilities.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeProxy PROXY;

    @GetMapping("employees/{id}")
    public Employee get(@PathVariable("id") long id){

        return PROXY.get(id);

    }
}
