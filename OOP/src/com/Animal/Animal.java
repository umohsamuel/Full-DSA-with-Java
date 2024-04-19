package com.Animal;

public class Animal {
    protected double height;
    protected int weight;
    protected String animalType;
    protected String bloodType;

    public Animal() {
        this.height = 6.5;
        this.weight = 50;
        this.animalType = "Mammal";
        this.bloodType = "O+";
    }

    public Animal(double height, int weight, String animalType, String bloodType) {
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
    }

    public double getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getBloodType() {
        return bloodType;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "height=" + getHeight() +
                ", weight=" + getWeight() +
                ", animalType='" + getAnimalType() + '\'' +
                ", bloodType='" + getBloodType() + '\'' +
                '}';
    }

    public void ShowInfo() {
        System.out.println(this.toString());
    }
}
