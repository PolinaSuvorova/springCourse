package com.polinasuvorova.aop;

import org.springframework.stereotype.Component;

@Component
public class Library extends AbstarctLibrary {

  //  @Override
    public void getBook( ){
    System.out.println("Берём книгу "  );
    }

    public String  retunBook(){
        System.out.println("Возвращаем книгу");
        return "Возвращаем книгу";
    }

    public void getMagazin(){
        System.out.println("Берём журнал");
    }

}
