package com.karthik.scopedemo.controllert;

import com.karthik.scopedemo.Entity.Employee;
import com.karthik.scopedemo.Entity.User;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Scope("session")
public class EmployeeController {
    @Autowired
    User user;
    @Autowired
    Employee employee;
    public EmployeeController() {
        System.out.println("EmployeeController Initialized");
    }

    @PostConstruct
    public void init()
    {
        System.out.println("employee controller hashcode is :" +this.hashCode()+" User Object" +
                " hashcode is :"+user.hashCode()+ " Employee hashcode : "+employee.hashCode()   );
    }

    @GetMapping(path="/fetchUser")
    public ResponseEntity<String> getUserDetails(){
        System.out.println("fetch user api");
        return ResponseEntity.status(HttpStatus.OK).body("ok");
    }

    @GetMapping(path="/logout")
    public ResponseEntity<String> logout(HttpServletRequest request){
        System.out.println("fetch user api");
        request.getSession().invalidate();
        return ResponseEntity.status(HttpStatus.OK).body("ok");
    }
}
