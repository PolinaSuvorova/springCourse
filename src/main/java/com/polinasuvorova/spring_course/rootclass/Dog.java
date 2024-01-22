package com.polinasuvorova.spring_course.rootclass;

public class Dog implements Pet {

    @Override
    public void say( ) {
        System.out.println("Bow-wow");
    }
}
