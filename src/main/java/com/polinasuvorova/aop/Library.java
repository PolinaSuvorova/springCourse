package com.polinasuvorova.aop;

import org.springframework.stereotype.Component;

@Component
public class Library extends AbstarctLibrary {

  //  @Override
    public void getBook(Book book){
    System.out.println("Берём книгу " + book.getName() );
    }

    public String  retunBook(){
        System.out.println("Возвращаем книгу");
        return "Возвращаем книгу";
    }

    public void getMagazin(){
        System.out.println("Берём журнал");
    }

}
