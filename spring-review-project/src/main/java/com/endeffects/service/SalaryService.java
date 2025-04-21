package com.endeffects.service;

import com.endeffects.repository.EmployeeRepository;
import com.endeffects.repository.HoursRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SalaryService {

    HoursRepository hoursRepository;
    EmployeeRepository employeeRepository;

    public SalaryService(@Qualifier("RegHours") HoursRepository hoursRepository, EmployeeRepository employeeRepository) {
        this.hoursRepository = hoursRepository;
        this.employeeRepository = employeeRepository;
    }

    public void calculateRegularSalary() {

        System.out.println(employeeRepository.getHourlyRate() * hoursRepository.getHours());

    }
}
