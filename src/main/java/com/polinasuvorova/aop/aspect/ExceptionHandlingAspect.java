package com.polinasuvorova.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("com.polinasuvorova.aop.aspect.MyPointcuts.allGetMethods()")
    public void beforeGetExceptionAdvice() {
        System.out.println( "-----ExceptionHandlingAspect.beforeGetExceptionAdvice" );

    }
}
