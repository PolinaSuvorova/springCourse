package com.polinasuvorova.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAOP {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfigAOP.class);

        Library library = context.getBean("library", Library.class);
        Book book = context.getBean("book",Book.class);
        library.addBook("Полина", book );
        library.addMagazin( );
        library.getBook( );
        library.getMagazin();

        context.close();
    }
}
