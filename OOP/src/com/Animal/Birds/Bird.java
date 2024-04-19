package com.Animal.Birds;

import com.Animal.Animal;

public class Bird extends Animal {
    protected boolean feathers;
    protected boolean flight;

    public Bird() {
        super();
        this.feathers = true;
        this.flight = true;
    }

    public Bird(double height, int weight, String animalType, String bloodType, boolean feathers, boolean flight) {
        super(height, weight, animalType, bloodType);
        this.feathers = feathers;
        this.flight = flight;
    }

    public boolean getFeathers() {
        return feathers;
    }

    public boolean getFlight() {
        return flight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "height=" + getHeight() +
                ", weight=" + getWeight() +
                ", animalType='" + getAnimalType() + '\'' +
                ", bloodType='" + getBloodType() + '\'' +
                "Feathers=" + getFeathers() +
                "Flight=" + getFlight() +
                '}';
    }

    public void ShowInfo() {
        System.out.println(this.toString());
    }
}
