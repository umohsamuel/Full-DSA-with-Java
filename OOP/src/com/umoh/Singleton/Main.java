package com.umoh.Singleton;

public class Main {
    public static void main(String[] args) {
        Working LetsTry = Working.getInstance();
        System.out.println(LetsTry.isItWorking);
    }
}
