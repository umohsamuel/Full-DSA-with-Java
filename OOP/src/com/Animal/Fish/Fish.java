package com.Animal.Fish;

import com.Animal.Animal;

public class Fish extends Animal {
    protected String habitat;
    protected String organForRespiration;

    public Fish() {
        super();
        this.habitat = "Sea";
        this.organForRespiration = "Gills";
    }

    public Fish(double height, int weight, String animalType, String bloodType, String habitat, String organForRespiration) {
        super(height, weight, animalType, bloodType);
        this.habitat = habitat;
        this.organForRespiration = organForRespiration;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getOrganForRespiration() {
        return organForRespiration;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "height=" + getHeight() +
                ", weight=" + getWeight() +
                ", animalType='" + getAnimalType() + '\'' +
                ", bloodType='" + getBloodType() + '\'' +
                "Habitat=" + getHabitat() +
                "OrganForRespiration=" + getOrganForRespiration() +
                '}';
    }

    public void ShowInfo() {
        System.out.println(this.toString());
    }
}
