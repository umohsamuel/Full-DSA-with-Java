package com.Abstract;

public class NonVegan extends Person {
    @Override
    public void eat(String like) {
        System.out.println("I eat non vegan food like: " + like);
    }
}
