package com.olegarts.controller;

import com.olegarts.dto.User;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;


@RestController
@RequestMapping("/users")
public class Consume_RestTemplate {
//here we need to provide which end point we are consuming
    private final String URI = "https://jsonplaceholder.typicode.com/users";

    private final RestTemplate restTemplate;

    public Consume_RestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public User[] readAllUsers(){
//getForEntity is for DTO
        ResponseEntity<User[]>  responseEntity = restTemplate.getForEntity(URI,User[].class); //not common

        return responseEntity.getBody();

    }
//@1:06:11
    @GetMapping("{id}")
    public Object readUser(@PathVariable("id") Integer id){

        String URL = URI + "/{id}";
//getForObject, gets the response, and then give it to you. does not care about the DTO.
        return restTemplate.getForObject(URL,Object.class,id);
    }


    @GetMapping("/test")
    public ResponseEntity<Object> consumeFromDummyApi(){

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("app-id","6298ebfecd0551211fce37a6");

        HttpEntity<String> entity = new HttpEntity<>(headers);
//exchange, to be able to send certain things to a header
        ResponseEntity<Object> response = restTemplate.exchange("https://dummyapi.io/data/v1/user?limit=10", HttpMethod.GET,entity,Object.class);

        return response;

    }
}











