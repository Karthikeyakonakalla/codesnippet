package com.karthik.myfirstapp.component;

import org.springframework.stereotype.Component;

@Component
public class OnlineOrder implements Order1  {
    public OnlineOrder() {
       // System.out.println("Online Order");
    }
    public void call()
    {
        System.out.println("Online Order");
    }

}
