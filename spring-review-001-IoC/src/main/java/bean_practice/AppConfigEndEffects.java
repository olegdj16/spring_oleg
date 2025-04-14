package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfigEndEffects {

    @Bean(name = "welcomeToEndEffects")
    public String str1(){
        return "Welcome to EndEffects!";
    }

    @Primary
    @Bean(name = "springCorePractice")
    public String str2(){
        return "Spring Core Practice";
    }

}
