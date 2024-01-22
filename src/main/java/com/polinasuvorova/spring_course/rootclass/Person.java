package com.polinasuvorova.spring_course.rootclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    /*   @Autowired
    @Qualifier("dog")*/
    private Pet pet;
    @Value("${person.surname}")
    private String surname;

    @Value("${person.age}")
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

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
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
