package com.polinasuvorova.aop.aspect;

import com.polinasuvorova.aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLogingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед методом getStudents");
        System.out.println("-----------------------------------------------");
    }

    @AfterReturning( pointcut = "execution(* getStudents())",
                     returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){

        Student firstStudent = students.get(0);
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mrs. " + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        double averageGrade = firstStudent.getAvarageGrade();
        averageGrade += 1;
        firstStudent.setAvarageGrade(averageGrade);

        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка студентов" +
                " после работы метода  getStudents");
        System.out.println("-----------------------------------------------");
    }

    @AfterThrowing( pointcut = "execution(* getStudents())",
     throwing = "ex")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable ex){
        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем исключение" + ex +
                " в методе  getStudents");
        System.out.println("-----------------------------------------------");
    }

    @After("execution(* getStudents())" )
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: логируем запуск after" +
                " в методе  getStudents");
        System.out.println("-----------------------------------------------");
    }

}
