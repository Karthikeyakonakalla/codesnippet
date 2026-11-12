package com.karthik.bookApplication.Service;

import org.apache.catalina.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

//@Component
public class SecondProgrammaticApproach {

    TransactionTemplate transactionTemplate;

    public SecondProgrammaticApproach(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void updateUser(){
        TransactionCallback<TransactionStatus> dbOperationsTask=(TransactionStatus status)->{
            System.out.println("perform operations");
            return status;
        };
        transactionTemplate.execute(dbOperationsTask);

    }
}
