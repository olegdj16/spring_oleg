package com.olegarts.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoAppUsingBeanAnnotation {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        // created a container
        // ft - is a bean from container
        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount();

        PartTimeMentor pt = container.getBean(PartTimeMentor.class);
        pt.createAccount();

        String strDeveloper = container.getBean(String.class);
        System.out.println("strDeveloper: " + strDeveloper);



    }
}
