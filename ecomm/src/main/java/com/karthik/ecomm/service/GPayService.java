package com.karthik.ecomm.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class GPayService implements PaymentService,InitializingBean, DisposableBean {

    @PostConstruct
    public void init()
    {
        System.out.println("init method called");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("gpay service invoked");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("gpay service after propertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("gpay service destroy");
    }

    @PreDestroy
    public void destroy1PreDestroy()
    {
        System.out.println("gpay service pre destroy");
    }
}
