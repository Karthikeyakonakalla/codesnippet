package com.karthik.ecomm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EcommApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(EcommApplication.class, args);
        System.out.println(applicationContext.getBean("productService"));
        System.out.println(applicationContext.getBean("GPayService"));
        System.out.println(applicationContext.getBean("creditCardService"));
        System.out.println("application context is created");
        //applicationContext.close();
    }

}
