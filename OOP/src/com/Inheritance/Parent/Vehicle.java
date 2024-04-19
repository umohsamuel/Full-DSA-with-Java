package com.Inheritance.Parent;

public class Vehicle {
    private String engine;
    private int seat;
    private String brand;
    private int wheel;

    public Vehicle() {
        engine = "V12";
        seat = 4;
        brand = "Toyota";
        wheel = 4;
    }

    public Vehicle(String engine, int seat, String brand, int wheel) {
        this.engine = engine;
        this.seat = seat;
        this.brand = brand;
        this.wheel = wheel;
    }

    public String getEngine() {
        return engine;
    }

    public int getSeat() {
        return seat;
    }

    public String getBrand() {
        return brand;
    }

    public int getWheel() {
        return wheel;
    }

    public void run() {
        System.out.println("Running Vehicle");
    }
}
