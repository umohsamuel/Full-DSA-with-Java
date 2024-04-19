package com.newoop;

public class Car {
    private String Brand;
    private int Seat;
    private String Engine;
    private int Speed;

    public Car() {
        Brand = "Porsche";
        Seat = 0;
        Engine = "not running";
        Speed = 0;
    }

    public Car(String Brand, int Seat, String Engine, int Speed) {
        this.Brand = Brand;
        this.Seat = Seat;
        this.Engine = Engine;
        this.Speed = Speed;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getSeat() {
        return Seat;
    }

    public void setSeat(int seat) {
        Seat = seat;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public String running() {
        if (!Brand.isEmpty() && Engine.equals("running") && Seat > 0 && Speed > 0) {
            return "running";
        } else return "not running";
    }
}
