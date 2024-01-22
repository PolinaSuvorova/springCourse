package com.polinasuvorova.spring_course.rootclass;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCreateApplContext {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say( );
        context.close();
    }
}
