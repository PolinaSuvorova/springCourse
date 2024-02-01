package com.polinasuvorova.aop;

import org.springframework.stereotype.Component;

@Component
public class Library extends AbstarctLibrary {

  //  @Override
    public void getBook( ){
    System.out.println("Берём книгу "  );
        System.out.println("-----------------------------------");
    }

    public String returnBook(){
        System.out.println("Возвращаем книгу");
        return "Война и мир";
    }

    public void getMagazin(){
        System.out.println("Берём журнал");
        System.out.println("-----------------------------------");
    }

    public String returnMagazin(){
        System.out.println("Возвращаем журнал");
        return "Война и мир";
    }

    public void addMagazin(){
        System.out.println("Добавить журнал");
        System.out.println("-----------------------------------");
    }

    public void addBook(String personName, Book book){
        System.out.println("Добавить книгу");
        System.out.println("-----------------------------------");
    }

}
