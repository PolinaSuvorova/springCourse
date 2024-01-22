package com.polinasuvorova.spring_course.rootclass;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog dog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);
        if ( dog == yourDog ) {
            System.out.println("Ссылки равны для scope singletone");
        }else{
            System.out.println("Ссылки не равны для scope prototype");
        }

        dog.setName("Bob");
        yourDog.setName("Jon");
        System.out.println(dog.getName());
        System.out.println(yourDog.getName());

        context.close();
    }
}
