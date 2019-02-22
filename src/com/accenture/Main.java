package com.accenture;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = creator();
        students[1] = creator();
        students[2] = creator();

        printArray(students);
        printMaximalGpa(students);
        printMinimalGpa(students);

        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to change the info, please choose the operation! ");
        System.out.print("Type 1 to change STUDENT 1 | Type 2 to change STUDENT 2  | Type 3 to change STUDENT 3: ");
        char operator = scanner.next().charAt(0);
        switch (operator) {
            case '1':
                students[0].setName("Tom");
                students[0].setAge(21);
                students[0].setGpa(10);
                printArray(students);
                break;
            case '2':
                students[1].setName("Bob");
                students[1].setAge(18);
                students[1].setGpa(9);
                printArray(students);
                break;
            case '3':
                students[2].setName("Alis");
                students[2].setAge(23);
                students[2].setGpa(10);
                printArray(students);
                break;
            case '0':
                UserInput.school();
            default:
                System.out.println("---");
        }
    }

    public static Student creator() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.next();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();

        System.out.print("Enter GPA: ");
        int gpa = scanner.nextInt();

        return new Student(name, age, gpa);

    }

    public static void printArray(Student[] students) {
        System.out.println(Arrays.asList(students));
    }

    public static void printMaximalGpa(Student[] students) {
        int maxGpa = students[0].gpa;
        String nameGpa = students[0].name;
        for (int i = 0; i < students.length; i++) {
            if (students[i].gpa > maxGpa) {
                maxGpa = students[i].gpa;
                nameGpa = students[i].name;
            }

        }
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("BIGGEST GPA is: " + maxGpa + " to " + nameGpa);
    }

    public static void printMinimalGpa(Student[] students) {
        int minGpa = students[0].gpa;
        String nameGpa = students[0].name;
        for (int i = 0; i < students.length; i++) {
            if (students[i].gpa < minGpa) {
                minGpa = students[i].gpa;
                nameGpa = students[i].name;
            }

        }
        System.out.println("SMALLEST GPA is: " + minGpa + " to " + nameGpa);
        System.out.println("------------------------------------------------------------------------------");
    }


}
