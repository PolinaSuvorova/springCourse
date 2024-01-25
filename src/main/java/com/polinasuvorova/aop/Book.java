package com.polinasuvorova.aop;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

;

@Component
public class Book {
    @Value("Name_Of_Book")
    private String name;

    public String getName() {
        return name;
    }
}
