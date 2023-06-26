package com.cydeo.client;

import com.cydeo.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "https://jsonplaceholder.typicode.com/",name = "USER-CLIENT")
public interface UserClient {
//here, go to the 3rd party end point,and execute this GET method
    //then bring data and assign to this List user
    //we can call this in any controller
    @GetMapping("/users")
    List<User> getUsers();
}
