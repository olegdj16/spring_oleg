package stereotype_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stereotype_annotations.config.AppConfig;
import stereotype_annotations.model.DataStructure;
import stereotype_annotations.model.Microservice;

public class AppRunner {
    public static void main(String[] args) {

        // container
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

        DataStructure ds = container.getBean(DataStructure.class);
        Microservice ms = container.getBean(Microservice.class);

        ds.getTotalHours();
        ms.getTotalHours();

        System.out.println("===");


    }
}
