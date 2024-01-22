package com.polinasuvorova.spring_course.rootclass;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotationContext {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Cat cat = context.getBean("cat", Cat.class);
        cat.say();
        context.close();
    }
}
