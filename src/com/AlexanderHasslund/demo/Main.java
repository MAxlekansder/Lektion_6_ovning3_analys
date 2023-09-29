package com.AlexanderHasslund.demo;

public class Main {
    public static void main(String[] args) {
        String name = "Alexander";
        int age = 30;

        Student student = new Student(name,age);
        System.out.println(student.name + " " + student.age);
        /* TODO
         *   Change the names of files + packages to relevant names
         *   Find the errors in the code and resolve it!
         */
        System.out.println(Student.doubleMyAge(age));

        for (int i = 0; i < 5;i++){
            System.out.println("Inside the method runMyForLoop" + i);
            runMyForLoop();
        }
    }



    public static void runMyForLoop() {

        System.out.println("runMyForLoop");

    }
}

