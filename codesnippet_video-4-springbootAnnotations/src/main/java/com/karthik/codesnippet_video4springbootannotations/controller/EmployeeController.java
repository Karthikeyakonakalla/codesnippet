package com.karthik.codesnippet_video4springbootannotations.controller;

import com.karthik.codesnippet_video4springbootannotations.Entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @RequestMapping(path="/getEmployeeById/{empid1}",method= RequestMethod.GET)
  //  @GetMapping("/getEmployeeById/{empid1}")
    public String getEmployee(@PathVariable Integer empid1)
    {
        System.out.println(empid1);
        return "employee"+empid1;
    }

//    @RequestMapping(path="/addEmployee",method= RequestMethod.POST)
    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee)
    {
        System.out.println(employee);
        return "employee";
    }

    @PutMapping("/updateEmployee")
    public String updateEmployee()
    {
        return "employee";
    }
    @DeleteMapping("/deleteEmployee")
    public String deleteEmployee()
    {
        return "employee";
    }

}
