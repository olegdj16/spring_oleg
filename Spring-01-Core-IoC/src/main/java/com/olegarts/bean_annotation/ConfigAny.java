package com.olegarts.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigAny {

    @Bean
    String str(){
        return "Developer";
    }

    // add @Bean here, need to use class name
    @Bean
    Integer number(){
        return 100;
    }


}
