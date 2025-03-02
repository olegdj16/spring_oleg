package com.olegarts.repository;

import com.olegarts.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> { //here we are passing entity and unique one.
}
