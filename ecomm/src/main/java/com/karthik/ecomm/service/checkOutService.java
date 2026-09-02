package com.karthik.ecomm.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class checkOutService {
    PaymentService paymentService;
   // @Autowired
    public checkOutService( PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("constructor  method called");
    }
    @PostConstruct
    public void init()
    {
        System.out.println("check out service is initialized");
    }

    public void checkOut(double amount){
        paymentService.processPayment(amount);
        System.out.println("checkout order for amount "+ amount);
    }
}
