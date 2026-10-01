package com.karthik.myfirstapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class  Order {
    User user;
    public Order() {
        System.out.println("Order constructor called");
    }
    public void setOrder(User user1) {
        user.call();
        this.user = user1;
        System.out.println("Orderclass set method");
        user.call();
    }
}
