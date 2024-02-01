package com.polinasuvorova.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class TestUniversityStudents {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfigAOP.class);

        University university = context.getBean("university", University.class);
        university.addStudents();
        try {
            List<Student> students = university.getStudents();
            System.out.println(students);
        } catch (Exception e) {
            System.out.println("catch Exception in main method:" + e);
        }
        context.close();
    }
}
