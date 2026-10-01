package com.karthik.myfirstapp.component;

import org.springframework.stereotype.Component;

@Component
public class OfflineOrder implements Order1{
    public OfflineOrder() {
      //  System.out.println("offline order");
    }

    public void call()
    {
        System.out.println("offline order");
    }

}
