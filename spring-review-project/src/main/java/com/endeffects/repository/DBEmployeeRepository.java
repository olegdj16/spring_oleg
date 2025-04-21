package com.endeffects.repository;

import com.endeffects.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class DBEmployeeRepository implements EmployeeRepository {

    @Override
    public int getHourlyRate() {

        Employee employee = new Employee("Harold Finch", "IT", 65);

        return employee.getHourlyRate();
    }
}
