package bean_practice;

import org.springframework.context.annotation.Bean;

public class NewAppConfig {

    @Bean(name = "String 1")
    public String str1(){
        return "Welcome to CydeoApp";
    }

    @Bean
    public String str2(){
        return "Spring Core Practice";
    }
}
