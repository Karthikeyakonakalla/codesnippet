package com.karthik.ecomm.Config;

import com.karthik.ecomm.service.CreditCardService;
import com.karthik.ecomm.service.GPayService;
import com.karthik.ecomm.service.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {
    //@Bean
     public PaymentService CreditCardService() {
         return new CreditCardService();
     }

     //@Bean
     public PaymentService GPayService() {
        return new GPayService();
     }

}
