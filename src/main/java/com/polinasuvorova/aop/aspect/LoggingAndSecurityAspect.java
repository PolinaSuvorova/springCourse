package com.polinasuvorova.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(public void com.polinasuvorova.aop.Library.*Magazin( ))")
    public void MagazinAllMethodsFromLibrary() {
    }
    @Pointcut("execution(public void com.polinasuvorova.aop.Library.get*( ))")
    public void getAllMethodsFromLibrary() {
    }

    @Pointcut("execution(public void com.polinasuvorova.aop.Library.return*( ))")
    public void returnAllMethodsFromLibrary() {
    }

    @Pointcut("getAllMethodsFromLibrary() || returnAllMethodsFromLibrary()")
    public void AllMethodsReturnAndGetFromLibrary() {
    }

    @Pointcut("AllMethodsReturnAndGetFromLibrary() && !MagazinAllMethodsFromLibrary()")
    public void AllMethodsReturnAndGetFromLibraryOnlyBook() {
    }
    @Before("AllMethodsReturnAndGetFromLibrary()")
    public void beforeReturnAndGetLoggingAdvice() {
        System.out.println("AllMethodsReturnAndGetFromLibrary: попытка получить книгу");
    }

    @Before("AllMethodsReturnAndGetFromLibraryOnlyBook()")
    public void beforeAllMethodsReturnAndGetFromLibraryOnlyBookLoggingAdvice() {
        System.out.println("beforeAllMethodsReturnAndGetFromLibraryOnlyBookLoggingAdvice: попытка получить книгу");
    }

    @Before("getAllMethodsFromLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGet_LoggingFromLibrary: попытка получить книгу");
    }

    @Before("returnAllMethodsFromLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturn_LoggingFromLibrary: попытка отдать книгу");
    }
/*    @Before("com.polinasuvorova.aop.aspect.LoggingAspect.allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGet_LoggingAdvice: попытка получить книгу");
    }
    @Before("com.polinasuvorova.aop.aspect.LoggingAspect.allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGet_SecurityAdvice: проверка на получение книги или журнаа");
    }*/
}
