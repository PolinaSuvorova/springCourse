package com.polinasuvorova.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("com.polinasuvorova.aop.aspect.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionAdvice() {
        System.out.println( "-----ExceptionHandlingAspect.beforeAddExceptionAdvice" );
        System.out.println("-----------------------------------");
    }
}
