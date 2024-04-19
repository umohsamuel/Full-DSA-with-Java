package com.interfaces;

public class Samsung implements Phone {
    @Override
    public String model() {
        return "Galaxy S24 Ultra";
    }

    @Override
    public String chip() {
        return "Snapdragon 888";
    }

    @Override
    public int ramInGB() {
        return 32;
    }
}
