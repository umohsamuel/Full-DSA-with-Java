package com.Abstract;

public abstract class Person implements Alive, Healthy {
    public void speak(String name) {
        System.out.println("Hello I am " + name);
    }

    @Override
    public void breathing() {
        System.out.println("Person is Breathing");
    }

    @Override
    public void exercise() {
        System.out.println("Person is excersising");
    }

    public abstract void eat(String like);
}
