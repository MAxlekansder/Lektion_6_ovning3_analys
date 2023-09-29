package com.AlexanderHasslund.demo;

public class Student {

    int age;
    String name;

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public static int doubleMyAge(int age) {
        return age * 2;
    }

    public static String sayHello(String name) {
        return name;
    }

}
