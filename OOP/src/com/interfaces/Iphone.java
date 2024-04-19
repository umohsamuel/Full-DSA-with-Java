package com.interfaces;

public class Iphone implements Phone {
    private String model;
    private String chip;
    private int ramInGB;

    public Iphone(String model, String chip, int ramInGB) {
        this.model = model;
        this.chip = chip;
        this.ramInGB = ramInGB;
    }

    @Override
    public String model() {
        return this.model;
    }

    @Override
    public String chip() {
        return this.chip;
    }

    @Override
    public int ramInGB() {
        return this.ramInGB;
    }
}
