package com.karthik.ecomm.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class DefaultPaymentService implements PaymentService {
    public void processPayment() {
        System.out.println("default payment service");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("default payment service method");
    }
}
