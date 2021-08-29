package com.yared.service.utilities.employee;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="user-server")
public interface EmployeeProxy {


    @GetMapping("/users/{id}")
    Employee get(@PathVariable long id);

}
