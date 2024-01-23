package com.polinasuvorova.spring_course.rootclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("com.polinasuvorova.spring_course.rootclass")
public class MyConfig {
    @Bean
    @Scope("singleton")
    public Pet catBean(){
        System.out.println( "Create bean cat");
        return new Cat();
    }

    @Bean
    @Scope("singleton")
    public Person personBean(){
        return  new Person(catBean());
    }
}
