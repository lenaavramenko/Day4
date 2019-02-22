package com.accenture;

public class Student {

    int age;
    String name;
    int gpa;


    public Student(String name, int age, int gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void help(){

    }

    public void tellTeacher(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(int age) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "NAME = " + name +
                ", AGE = '" + age + '\'' +
                ", GPA = " + gpa +
                '}';
    }
}
