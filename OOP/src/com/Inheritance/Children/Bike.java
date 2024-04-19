package com.Inheritance.Children;

import com.Inheritance.Parent.Vehicle;

public class Bike extends Vehicle {
    private String handle;

    public Bike() {
        super();
        this.handle = "Short";
    }

    public Bike(String handle, String engine, int seat, String brand, int wheel) {
        super(engine, seat, brand, wheel);
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    @Override
    public String toString() {
        return "Bike = {" +
                "handle: " + getHandle() + ", \n" + "engine: " + getEngine() + ", \n" + "seat: " + getSeat() + ", \n" + "brand: " + getBrand() + ", \n" + "wheel: " + getWheel() +
                '}';
    }
}
