package bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {



    //how to create spring container ? This is your container
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class, NewAppConfig.class);

        FullTimeEmployee ft = container.getBean(FullTimeEmployee.class);
        ft.createAccount();

        PartTimeEmployee pt = container.getBean(PartTimeEmployee.class);
        pt.createAccount();

        String str1 = container.getBean("String 1", String.class);
        System.out.println(str1);

        String str2 = container.getBean("str2", String.class);
        System.out.println(str2);

    }
}
