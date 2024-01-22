package com.polinasuvorova.spring_course.rootclass;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Helloy, my lovely pet");
        pet.say();
    }
}
