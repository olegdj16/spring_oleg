package com.olegarts.service;

import com.olegarts.repository.EmployeeRepository;
import com.olegarts.repository.HoursRepository;
import org.springframework.beans.factory.annotation.Qualifier;

public class OvertimeSalaryService {

    HoursRepository hoursRepository;
    EmployeeRepository employeeRepository;

    public OvertimeSalaryService(@Qualifier("OTH") HoursRepository hoursRepository, EmployeeRepository employeeRepository) {
        this.hoursRepository = hoursRepository;
        this.employeeRepository = employeeRepository;
    }

    public void calculateOvertimeSalary(){
        System.out.println(hoursRepository.getHours());
    }
}
