package com.polinasuvorova.spring_course.rootclass;

//@Component("catBean")
public class Cat implements Pet{
    public Cat(){
        System.out.println("Cat bean is created");
    }
    @Override
    public void say() {
        System.out.println("Mur-Mur");
    }
}
