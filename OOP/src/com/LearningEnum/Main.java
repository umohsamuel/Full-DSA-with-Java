package com.LearningEnum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Learning thingToLearn = Learning.CORE;

        switch (thingToLearn) {
            case CORE:
                System.out.println("Learn core java concepts");
                break;
            case SPRING:
                System.out.println("Learn Spring framework");
                break;
            case GENERICS:
                System.out.println("Learn about generics");
                break;
            case SPRINGBOOT:
                System.out.println("Learn about springboot for backend");
                break;
            case MULTITHREADING:
                System.out.println("Learn about multithreading in java");
                break;
            default:
                System.out.println("This doesn't match any of the inputs");
                break;
        }

//        String name1 = "Big daddy Sam";
//        String name2 = "Big daddy Sam";
//
//        String name3 = new String("Big daddy Sam");
//
//        System.out.println(name1.equals(name3));

        String[] rollnames = {"Shade", "Samuel", "Hmm1", "Hmm2w34"};

        System.out.println("First is " + rollnames);
        displayNames(rollnames);

        System.out.println("*****************");
        System.out.println(Arrays.toString(rollnames));
    }

    static void displayNames(String[] names) {
        System.out.println("Second is " + names);
        names[0] = "My baby";
        for (String name : names) {
            System.out.println(name);
        }
    }
}
