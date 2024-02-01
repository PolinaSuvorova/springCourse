package com.polinasuvorova.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class University {
    private final List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student(" Иван Иванов", 4, 4.4);
        Student st2 = new Student(" Пётр Иванов", 3, 3.4);
        Student st3 = new Student(" Пётр Сидоров", 1, 2.4);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println("->Begin of method getStudents:");
        System.out.println(students.get(3)); // exception
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        return students;
    }
}
