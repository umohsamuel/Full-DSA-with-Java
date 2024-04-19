package com.Animal.Reptile;

import com.Animal.Animal;

public class Reptile extends Animal {

    protected String skinType;
    protected boolean backbone;
    protected String eggShellType;

    public Reptile() {
        super();
        this.skinType = "Dry";
        this.backbone = true;
        this.eggShellType = "Soft";
    }

    public Reptile(double height, int weight, String animalType, String bloodType, String skinType, boolean backbone, String eggShellType) {
        super(height, weight, animalType, bloodType);
        this.skinType = skinType;
        this.backbone = backbone;
        this.eggShellType = eggShellType;
    }

    public String getSkinType() {
        return skinType;
    }

    public boolean getBackbone() {
        return backbone;
    }

    public String getEggShellType() {
        return eggShellType;
    }

    @Override
    public String toString() {
        return "Reptile{" +
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
