package com.polinasuvorova.aop.aspect;

import com.polinasuvorova.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("com.polinasuvorova.aop.aspect.MyPointcuts.allAddMethods()")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }

    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: попытка получить книгу");
    }

    @Before("com.polinasuvorova.aop.aspect.MyPointcuts.allAddMethods()")
    public void beforeGetLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("LoggingAspect.beforeAddLoggingAdvice");
        System.out.println("MethodSignature = " + methodSignature);
        System.out.println("-------------- method = " + methodSignature.getMethod());
        System.out.println("-------------- returnType= " + methodSignature.getReturnType());
        System.out.println("-------------- name= " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println(
                            "---Инфо о книге : " + myBook.getName() +
                            " год " + myBook.getYearOfPublication() +
                            " автор " + myBook.getAuthor());
                }

            }
        }


    }
}
