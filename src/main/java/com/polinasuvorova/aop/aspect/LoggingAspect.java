package com.polinasuvorova.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("com.polinasuvorova.aop.aspect.MyPointcuts.allGetMethods()")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }

    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: попытка получить книгу");
    }

    @Before("com.polinasuvorova.aop.aspect.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("LoggingAspect.beforeGetLoggingAdvice");
    }
}
