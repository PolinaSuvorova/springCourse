package com.polinasuvorova.spring_course.rootclass;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotationContext {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("personBean",Person.class);
        person.callYourPet();
/*        Cat cat = context.getBean("catBean", Cat.class);
        cat.say();*/
        context.close();
    }
}