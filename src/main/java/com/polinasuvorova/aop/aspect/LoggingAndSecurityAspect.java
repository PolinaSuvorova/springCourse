package com.polinasuvorova.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {
    @Before("com.polinasuvorova.aop.aspect.LoggingAspect.allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGet_LoggingAdvice: попытка получить книгу");
    }
    @Before("com.polinasuvorova.aop.aspect.LoggingAspect.allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGet_SecurityAdvice: проверка на получение книги или журнаа");
    }
}
