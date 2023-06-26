package com.cydeo.client;


import com.cydeo.dto.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(url = "https://dummyapi.io",name = "EMPLOYEE-CLIENT")
public interface EmployeeClient {
//01:58:00 03 Spring rest 02
    @GetMapping("/data/v1/user?limit=10")
    //here I am trying to get specific employee
    Employee getEmployee(@RequestHeader("app-id") String id);

    //https://dummyapi.io/data/v1/user?limit=10
}


