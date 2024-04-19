package com.laptop;

import com.laptop.components.GraphicsCard;
import com.laptop.components.Processor;

public class Main {
    public static void main(String[] args) {
//        Laptop myLappy = new Laptop();
//        System.out.println(myLappy.getProcessor().getBrand() + " " + myLappy.getProcessor().getSeries());

        Processor processor = new Processor("AMD", "i3 3200U", 7, 2, 2, "1MB", "1.8Ghz", "1.8Ghz", "2.5Ghz");
        GraphicsCard graphicsCard = new GraphicsCard("Nvidia", 1020, "1GB");

        Laptop gamingLaptop = new Laptop(16.2f, processor, "4GB", "525GB", graphicsCard, null, "RGB Backlit");

        System.out.println(gamingLaptop.getProcessor().getFrequency());
        gamingLaptop.gamingMode();
        System.out.println(gamingLaptop.getProcessor().getFrequency());
    }
}
