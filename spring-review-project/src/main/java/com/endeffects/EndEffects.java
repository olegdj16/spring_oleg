package com.endeffects;

import com.endeffects.config.EmployeeConfig;
import com.endeffects.repository.HoursRepository;
import com.endeffects.service.SalaryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EndEffects {
    public static void main(String[] args) {

        // we need to create a container
        ApplicationContext container = new AnnotationConfigApplicationContext(EmployeeConfig.class);

        SalaryService salaryService = container.getBean(SalaryService.class);
        salaryService.calculateRegularSalary();

        HoursRepository hr = container.getBean(HoursRepository.class);
        System.out.println(hr);

    }
}
