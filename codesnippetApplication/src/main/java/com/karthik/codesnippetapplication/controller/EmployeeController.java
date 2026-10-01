package com.karthik.codesnippetapplication.controller;

import com.karthik.codesnippetapplication.dto.EmployeeDTO;
import com.karthik.codesnippetapplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    public EmployeeService getEmployeeService() {
        return employeeService;
    }

    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("get/employee/{id}")
    public EmployeeDTO getEmployee(@PathVariable int id ) {
        EmployeeDTO empdto=employeeService.getEmployee(id);
        System.out.println(empdto);
       // return ResponseEntity.ok(empdto);
        return empdto;

    }

}
