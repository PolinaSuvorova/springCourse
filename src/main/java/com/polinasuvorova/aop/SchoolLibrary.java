package com.polinasuvorova.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstarctLibrary{
   // @Override
    public void getBook( int counBook ){
        System.out.println("Взять книгу из школьной библиотеки");
    }
}
