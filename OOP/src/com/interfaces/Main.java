package com.interfaces;

public class Main {
    public static void main(String[] args) {
        Phone samsumgS24 = new Samsung();
        Phone iphone14Pro = new Iphone("14 Pro", "A13", 8);

        System.out.println(samsumgS24.model());
        System.out.println(iphone14Pro.model());
    }
}
