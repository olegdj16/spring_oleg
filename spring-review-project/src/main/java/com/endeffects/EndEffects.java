package com.endeffects;

import com.endeffects.config.EmployeeConfig;
import com.endeffects.repository.HoursRepository;
import com.endeffects.service.OvertimeSalaryService;
import com.endeffects.service.SalaryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EndEffects {
    public static void main(String[] args) {

        // Create Spring container
        ApplicationContext container = new AnnotationConfigApplicationContext(EmployeeConfig.class);

        // Get regular salary service and calculate
        SalaryService salaryService = container.getBean(SalaryService.class);
        salaryService.calculateRegularSalary();

        // Get overtime salary service and calculate
        OvertimeSalaryService overtimeSalaryService = container.getBean(OvertimeSalaryService.class);
        overtimeSalaryService.calculateOvertimeSalary();

        // If you really want to print one of the HoursRepository beans:
        HoursRepository regHours = (HoursRepository) container.getBean("regularHours");
        System.out.println("Regular hours repo: " + regHours);

        HoursRepository otHours = (HoursRepository) container.getBean("overtimeHours");
        System.out.println("Overtime hours repo: " + otHours);
    }
}
