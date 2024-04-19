package com.umohsamuel.ArrayList;

import java.util.ArrayList;

class IntWrapper {
    private int intValue;

    public IntWrapper(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<String> rollNames = new ArrayList<>();
        rollNames.add("Samuel");
        rollNames.add("Shade");
        rollNames.add("Oladejo");
        rollNames.add("Umoh");
        rollNames.add("Feranmi");
        rollNames.add("Nifemi");
        rollNames.add("Godwin");

        Main main = new Main();
//        main.displayNames(rollNames);
//        System.out.println("************");
//        main.removeByIndex(rollNames, 2);
//        main.displayNames(rollNames);
//        System.out.println("*************");
//        main.removeByString(rollNames, "Umoh");
//        main.displayNames(rollNames);
//        System.out.println("*************");
//        System.out.println(rollNames.get(2));
//
//        main.displayNames(rollNames);
//        System.out.println("***************");
//        main.modifyName(rollNames, 1, "My baby");
//        main.displayNames(rollNames);
//        System.out.println("*******************");
//        int position = main.getIndex(rollNames, "Nifemi");
//
//        System.out.println(main.nameIncludes(rollNames, "Nifemi"));
//
//        System.out.println("***************");
//        main.modifyName(rollNames, position, "Folashade");
//        main.displayNames(rollNames);

//        ArrayList<IntWrapper> numbers = new ArrayList<>();
//        numbers.add(new IntWrapper(23));
//        System.out.println(numbers.get(0).getIntValue());

//        how it is handled in java wrapper classes
        ArrayList<Integer> javanum = new ArrayList<>();
//we dont neeed to do it in production code like this this is just to learn about boxing and unboxing in java
        javanum.add(Integer.valueOf(23));

        System.out.println(javanum.get(0).intValue());
    }

    void displayNames(ArrayList<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    void removeByIndex(ArrayList<String> names, int index) {
        names.remove(index);
    }

    void removeByString(ArrayList<String> names, String name) {
        names.remove(name);
    }

    void modifyName(ArrayList<String> names, int index, String newName) {
        names.set(index, newName);
    }

    int getIndex(ArrayList<String> names, String name) {
        return names.indexOf(name);
    }

    boolean nameIncludes(ArrayList<String> names, String name) {
        return names.contains(name);
    }
}
