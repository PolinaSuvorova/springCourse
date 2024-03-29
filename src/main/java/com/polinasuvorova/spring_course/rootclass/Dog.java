package com.polinasuvorova.spring_course.rootclass;

import javax.annotation.PostConstruct;

//@Component
//@Scope("prototype")
public class Dog implements Pet {
    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

    @PostConstruct
    private void init(){
        System.out.println("Init dog method");
    }

    private void destroy(){
        System.out.println("Destroy dog method");
    }
}
