package com.Animal.Reptile;

public class Crocodile extends Reptile {
    public Crocodile() {
        super();
        eggShellType = "hard";
    }

    public Crocodile(double height, int weight, String animalType, String bloodType, String skinType, boolean backbone, String eggShellType) {
        super(height, weight, animalType, bloodType, skinType, backbone, eggShellType);
    }

    @Override
    public String toString() {
        return "Crocodile{" +
                "height=" + getHeight() +
                ", weight=" + getWeight() +
                ", animalType='" + getAnimalType() + '\'' +
                ", bloodType='" + getBloodType() + '\'' +
                "SkinType=" + getSkinType() +
                "BackBone=" + getBackbone() +
                "EggShellType=" + getEggShellType() +
                '}';
    }

    public void ShowInfo() {
        System.out.println(this.toString());
    }
}
