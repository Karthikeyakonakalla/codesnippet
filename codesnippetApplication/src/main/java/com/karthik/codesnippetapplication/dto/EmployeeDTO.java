    package com.karthik.codesnippetapplication.dto;

    import com.karthik.codesnippetapplication.entity.Employee;
    import lombok.ToString;


    @ToString
    public class EmployeeDTO {


        String name;
        String department;
        Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public  EmployeeDTO employeeMapperr(Employee employee) {
            this.setAge(employee.age);
            this.setDepartment(employee.department);
            this.setName(employee.name);
            return this;
        }
    }
