package com.olegarts.service;

import com.olegarts.repository.EmployeeRepository;
import com.olegarts.repository.HoursRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SalaryService {

    HoursRepository hoursRepository;
    EmployeeRepository employeeRepository;

    public SalaryService(@Qualifier("regularHours") HoursRepository hoursRepository, EmployeeRepository employeeRepository) {
        this.hoursRepository = hoursRepository;
        this.employeeRepository = employeeRepository;
    }

    public void calculateRegularSalary(){
        //HourlyRate * RegularHours
        //65 * 40
        System.out.println(employeeRepository.getHourlyRate() * hoursRepository.getHours());

    }
}
