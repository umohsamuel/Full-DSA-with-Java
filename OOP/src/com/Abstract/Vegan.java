package com.Abstract;

public class Vegan extends Person {
    @Override
    public void eat(String like) {
        System.out.println("I eat vegan food like: " + like);
    }

    @Override
    public void breathing() {
//        super.breathing();

        System.out.println("Vegan is breathing");
    }

    @Override
    public void exercise() {
//        super.exercise();
        System.out.println("Vegan is exercising");
    }
}
