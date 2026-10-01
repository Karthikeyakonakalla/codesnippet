package com.karthik.myfirstapp.component;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {
   // @Lazy
   @Qualifier("onlineOrder")
   @Autowired
    Order1 order1;
    public User() {
        System.out.println("User Constructor created");
    }
    @PostConstruct
    public void init() {
        //System.out.println("User class init method");
        order1.call();
    }
    public void call() {

    }
}
