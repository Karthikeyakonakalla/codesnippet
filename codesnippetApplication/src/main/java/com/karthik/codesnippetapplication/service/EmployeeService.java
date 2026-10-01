package com.karthik.codesnippetapplication.service;

import com.karthik.codesnippetapplication.dto.EmployeeDTO;
import com.karthik.codesnippetapplication.entity.Employee;
import com.karthik.codesnippetapplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository repo;

    public EmployeeDTO getEmployee(int id) {
        Employee emp=repo.getEmployee(id);
        EmployeeDTO employeeDTO=new EmployeeDTO();
         employeeDTO.employeeMapperr(emp);
         return employeeDTO;


    }
}
