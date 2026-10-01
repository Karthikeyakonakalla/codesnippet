package com.karthik.myfirstapp.DBConnection;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnProperty(prefix="mysqlconnection",
//        value="enabled",
//        havingValue = "create",
//        matchIfMissing = false)
@Profile("dev")
public class MYSqlConnection {
    @Value("${username}")
    String username;
    @Value("${password}")
    String password;

    @PostConstruct
    public void init(){
        System.out.println(" mysql  class init");
        System.out.println("User name : "+username+" password : "+password);
    }

}
