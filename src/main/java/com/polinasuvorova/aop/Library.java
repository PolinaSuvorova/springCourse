package com.polinasuvorova.aop;

import org.springframework.stereotype.Component;

@Component
public class Library extends AbstarctLibrary {

  //  @Override
    public void getBook( ){
    System.out.println("Берём книгу "  );
    }

    public void returnBook(){
        System.out.println("Возвращаем книгу");
    }

    public void getMagazin(){
        System.out.println("Берём журнал");
    }

    public void returnMagazin(){
        System.out.println("Возвращаем журнал");
    }

    public void addMagazin(){
        System.out.println("Добавить журнал");
    }

    public void addBook(){
        System.out.println("Добавить книгу");
    }

}
