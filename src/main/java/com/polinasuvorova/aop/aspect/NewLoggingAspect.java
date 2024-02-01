package com.polinasuvorova.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("1 aroundReturnBookLoggingAdvice: В библиотеку возвращают книгу");

        long begin = System.currentTimeMillis();
        Object targetResult = pjp.proceed();
        long end = System.currentTimeMillis();

        System.out.println(" total milesec = " + (end - begin) );

        System.out.println("2 aroundReturnBookLoggingAdvice: В библиотеку возвращают книгу");
        return targetResult;
    }
}
