package bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EndEffectsApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class, AppConfigEndEffects.class);

        FullTimeEmployee fullTimeEmployee = container.getBean(FullTimeEmployee.class);
        fullTimeEmployee.createAccount();

        PartTimeEmployee partTimeEmployee = container.getBean(PartTimeEmployee.class);
        partTimeEmployee.createAccount();

        // str1 is Bean name from AppConfigEndEffects
        String str1 = container.getBean("welcomeToEndEffects", String.class);
        System.out.println(str1);

        // because of @Primary annotation, str2 is the bean name from AppConfigEndEffects
        // and will print by default
        String str2 = container.getBean(String.class);
        System.out.println(str2);

    }
}
