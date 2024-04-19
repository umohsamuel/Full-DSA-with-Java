package com.Inheritance.Children;

import com.Inheritance.Parent.Vehicle;

public class Demo {
    public static void main(String[] args) {
//        Bike myOkada = new Bike("Long Handle", "Turbo V8", 2, "Ferrari", 2);
//        System.out.println(myOkada);

//        Truck myTrailer = new Truck(2, "Thermacool", "V8 Trailer engine", 2, "Mercedes", 4);
////        System.out.println(myTrailer);
//        myTrailer.run();

        Vehicle myPolymorphism = new Truck(3, "POyly", "VPouly", 3, "MerPoly", 6);
//        System.out.println(myPolymorphism);
        myPolymorphism.run();
    }
}
