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
        Object targetResult = null;
        System.out.println("1 aroundReturnBookLoggingAdvice: В библиотеку возвращают книгу");

        long begin = System.currentTimeMillis();
        try {
            targetResult = pjp.proceed();
        }catch (Exception e){
            System.out.println(" Exception: " + e );
            throw e;
        }

        long end = System.currentTimeMillis();

        System.out.println(" total milesec = " + (end - begin) );

        System.out.println("2 aroundReturnBookLoggingAdvice: В библиотеку возвращают книгу");
        return targetResult;
    }
}
