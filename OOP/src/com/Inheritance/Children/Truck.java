package com.Inheritance.Children;

import com.Inheritance.Parent.Vehicle;

public class Truck extends Vehicle {
    private int container;
    private String fridge;

    public Truck() {
        super();
        this.container = 1;
        this.fridge = "Deep freezer";
    }

    public Truck(int container, String fridge, String engine, int seat, String brand, int wheel) {
        super(engine, seat, brand, wheel);
        this.container = container;
        this.fridge = fridge;
    }

    public int getContainer() {
        return container;
    }

    public String getFridge() {
        return fridge;
    }

    @Override
    public String toString() {
        return "Truck = {" + '\n' +
                "container: " + getContainer() + ", \n" +
                "fridge: " + getFridge() + ", \n" +
                "engine: " + getEngine() + ", \n" +
                "seat: " + getSeat() + ", \n" +
                "brand: " + getBrand() + ", \n" +
                "wheel: " + getWheel() +
                '\n' + '}';
    }

//    public void run() {
//        System.out.println("Running truck....");
//        System.out.println(toString());
//    }
}
