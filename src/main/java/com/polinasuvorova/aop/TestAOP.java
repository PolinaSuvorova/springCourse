package com.polinasuvorova.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAOP {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfigAOP.class);

        Library library = context.getBean("library", Library.class);
        library.getBook();
        library.getMagazin();
        library.retunBook();

        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        schoolLibrary.getBook();


        context.close();
    }
}
