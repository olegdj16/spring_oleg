package com.endeffects.service;

import com.endeffects.repository.EmployeeRepository;
import com.endeffects.repository.HoursRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OvertimeSalaryService {

    HoursRepository hoursRepository;
    EmployeeRepository employeeRepository;

    public OvertimeSalaryService(@Qualifier("OverTimeHours") HoursRepository hoursRepository, EmployeeRepository employeeRepository) {
        this.hoursRepository = hoursRepository;
        this.employeeRepository = employeeRepository;
    }

    public void calculateOvertimeSalary() {

        System.out.println(employeeRepository.getHourlyRate() * hoursRepository.getHours());

    }
}
