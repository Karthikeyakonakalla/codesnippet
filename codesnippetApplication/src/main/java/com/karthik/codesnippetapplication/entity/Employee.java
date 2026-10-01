package com.karthik.codesnippetapplication.entity;

public class Employee {
    public Integer id;
   public  String name;
    public String department;
    public Integer age;


    public Employee(Integer id, String name, String department, Integer age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
    }
}
