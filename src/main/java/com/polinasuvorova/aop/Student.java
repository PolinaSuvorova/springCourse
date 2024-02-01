package com.polinasuvorova.aop;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String nameSurname;
    private int course;
    private double avarageGrade;

    public Student() {
    }

    public Student(String nameSurname, int course, double averageGrade) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.avarageGrade = averageGrade;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvarageGrade() {
        return avarageGrade;
    }

    public void setAvarageGrade(double avarageGrade) {
        this.avarageGrade = avarageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", course=" + course +
                ", avarageGrade=" + avarageGrade +
                '}';
    }
}
