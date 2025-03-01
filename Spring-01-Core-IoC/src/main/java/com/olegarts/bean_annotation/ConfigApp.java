package com.olegarts.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {

    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }

//    @Bean(name = "p1")
    @Bean
    @Primary
    PartTimeMentor partTimeMentorP1(){
        System.out.println("Part Time p1 Mentor is created");
        return new PartTimeMentor();
    }

//    @Bean(name = "p2")
    @Bean
    PartTimeMentor partTimeMentorP2(){
        System.out.println("Part Time p2 Mentor is created");
        return new PartTimeMentor();

    }
}
