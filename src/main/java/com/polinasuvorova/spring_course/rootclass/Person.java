package com.polinasuvorova.spring_course.rootclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    /*   @Autowired
    @Qualifier("dog")*/
    private Pet pet;
    private String surname;
    private Integer age;

    public Person() {
        System.out.println("Create person");
        //this.pet = pet;
    }

    @Autowired
    public Person(@Qualifier("dog") Pet pet) {
        System.out.println("Create person bean");
        this.pet = pet;
    }

    public void setSurname(String surname) {
        System.out.println("Set surname");
        this.surname = surname;
    }

    public void setAge(Integer age) {
        System.out.println("Set age");
        this.age = age;
    }

//    @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Set class pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Helloy, my lovely pet");
        pet.say();
    }
}
