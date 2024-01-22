package com.polinasuvorova.spring_course.rootclass;

public class Person {
    private Pet pet;

    public Person() {
        System.out.println("Create person");
        //this.pet = pet;
    }

    public void setPet( Pet pet ) {
        System.out.println("Set class pet");
     //   this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Helloy, my lovely pet");
        pet.say();
    }
}
