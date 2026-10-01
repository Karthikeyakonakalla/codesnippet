package com.karthik.myfirstapp.DBConnection;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBConnection {

    @Value("${username}")
    String username;
    @Value("${password}")
    String password;
    @PostConstruct
    public void init(){
        System.out.println(" DB class init");
        System.out.println("User name : "+username+" password : "+password);
    }
}
