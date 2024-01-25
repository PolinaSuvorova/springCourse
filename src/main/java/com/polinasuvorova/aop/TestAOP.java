package com.polinasuvorova.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAOP {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfigAOP.class);

        Library library = context.getBean("libraryBean", Library.class);
        library.getBook();

        context.close();
    }
}
