package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {
    @Bean
    Car car(){
        // create one Car object
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }

    // Direct wiring
//    @Bean
//    Person person(){
//        Person p = new Person();
//        p.setName("Mike");
//        p.setCar(car());
//        return p;
//    }


    // autowiring
@Bean
Person person(Car car){
    Person p = new Person();
    p.setName("Mike");
    p.setCar(car);
    return p;
}
}
