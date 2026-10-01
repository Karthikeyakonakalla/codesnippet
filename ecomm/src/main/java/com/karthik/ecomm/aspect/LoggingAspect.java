package com.karthik.ecomm.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("execution(* com.karthik.ecomm.service.ProductService.addProduct(..))")
    public  void namedPointcut() {}

    @Around("namedPointcut()")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable
    {
        System.out.println("before logging aspect method called");
        Object result = joinPoint.proceed();
        System.out.println("after Aspect Log is called");
        return result;
    }


}
