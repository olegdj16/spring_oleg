package com.olegarts.controller;

import com.olegarts.client.EmployeeClient;
import com.olegarts.client.UserClient;
import com.olegarts.dto.ResponseWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Consume_FeignClient {

    private final UserClient userClient;
    private final EmployeeClient employeeClient;

    public Consume_FeignClient(UserClient userClient, EmployeeClient employeeClient) {
        this.userClient = userClient;
        this.employeeClient = employeeClient;
    }

    @GetMapping("/api/v1/users")
    public ResponseEntity<ResponseWrapper> getUsers(){
        //here we are returning data to my API
        //body is coming from the GET user method.
        //we need to inject user client
        //this  is how are consuming API with the Feign Client
        return ResponseEntity.ok(new ResponseWrapper("UserList Retrieved",userClient.getUsers()));
    }

    @GetMapping("/api/v1/employee")
    public ResponseEntity<ResponseWrapper> getEmployee(){
        return ResponseEntity.ok(new ResponseWrapper("Successfully retrieved ",employeeClient.getEmployee("6298ebfecd0551211fce37a6")));
    }

}
