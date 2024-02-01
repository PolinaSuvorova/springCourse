package com.polinasuvorova.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAOP {
    public static void main(String[] args) {
        System.out.println("---Method Main starts----");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfigAOP.class);

        Library library = context.getBean("library", Library.class);
        String bookName = library.returnBook();
        context.close();

        System.out.println("---Method Main ends----");
    }
}
