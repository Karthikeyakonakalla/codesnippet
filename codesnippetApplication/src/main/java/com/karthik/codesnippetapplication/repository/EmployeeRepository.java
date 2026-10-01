package com.karthik.codesnippetapplication.repository;

import com.karthik.codesnippetapplication.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    public Employee getEmployee(int id) {
        Employee employee = new Employee(id,"karthik","It",21);
        return employee;
        
    }
}
