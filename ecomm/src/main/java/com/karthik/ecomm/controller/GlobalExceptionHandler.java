package com.karthik.ecomm.controller;

import com.karthik.ecomm.entity.ErrorResponse;
import com.karthik.ecomm.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<?> handleProductNotFoundException(ProductNotFoundException e) {
        ErrorResponse productNotFound=new ErrorResponse(LocalDateTime.now(),e.getMessage(),"Product really " +
                "not found");
        return new ResponseEntity<>(productNotFound, HttpStatus.NOT_FOUND);
    }

}
