package com.polinasuvorova.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogingAspect {

    @Before("execution(public void get*())")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }

    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice: попытка получить книгу");
    }
}
