package com.polinasuvorova.spring_course.rootclass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMyConfigClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.polinasuvorova.spring_course.rootclass");

        Cat cat = context.getBean("catBean", Cat.class);
        cat.say();

        Person person  = context.getBean("personBean", Person.class);
        person.callYourPet();
        context.close();
    }
}
