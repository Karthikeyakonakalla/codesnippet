package com.karthik.scopedemo.controllert;

import com.karthik.scopedemo.Entity.User;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Scope("request")
public class UserController {
        @Autowired
        User user;
        public UserController() {
            System.out.println("UserController Initialized");
        }

        @PostConstruct
        public void init()
        {
            System.out.println("UserController hashcode is : " +this.hashCode()+
                    "  User Object" +
                    " hashcode is : "+user.hashCode());
        }

        @GetMapping(path="/fetchUser1")
        public ResponseEntity<String> getUserDetails(){
            System.out.println("fetch user api");
            return ResponseEntity.status(HttpStatus.OK).body("ok");
        }

}
