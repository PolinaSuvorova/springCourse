package com.polinasuvorova.aop;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

;

@Component
public class Book {
    @Value("Name_Of_Book")
    private String name;

    @Value("А. С. Пушкин")
    private String author;
    @Value("1932")
    private int yearOfPublication;

    public String getAuthor() {
        return author;

    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getName() {
        return name;
    }
}
