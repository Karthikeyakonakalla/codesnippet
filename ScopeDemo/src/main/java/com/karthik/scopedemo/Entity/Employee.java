package com.karthik.scopedemo.Entity;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("")
public class Employee {
    @Autowired
    User user;
    public Employee() {
        System.out.println("Employee Initialized");
    }

    @PostConstruct
    public void init()
    {
        System.out.println("Employee hashcode : "+this.hashCode() +"User hashcode : "+user.hashCode());
    }


}
