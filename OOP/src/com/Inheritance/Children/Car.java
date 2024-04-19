package com.Inheritance.Children;

public class Car {
    private String airConditioner;
    private int radioChannels;

    public Car() {
        super();
        this.airConditioner = "Samsung AC";
        this.radioChannels = 50;
    }

    public Car(String airConditioner, int radioChannels) {
        super();
        this.airConditioner = airConditioner;
        this.radioChannels = radioChannels;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public int getRadioChannels() {
        return radioChannels;
    }
}
