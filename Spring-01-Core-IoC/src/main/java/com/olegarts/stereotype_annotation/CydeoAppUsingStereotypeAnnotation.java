package com.olegarts.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoAppUsingStereotypeAnnotation {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigCourse.class);
        context.getBean(Java.class).getJavaTeachingHours();
        context.getBean(Selenium.class).getSeleniumTeachingHours();
        context.getBean(Sql.class).getSqlTeachingHours();
    }
}
