package com.umoh.package_class_static;

public class Human {
    static long population;
    int age;
    String name;
    int salary;
    boolean married;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }

    static void message() {
        System.out.println("MyG");
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", married=" + married +
                '}';
    }
}
