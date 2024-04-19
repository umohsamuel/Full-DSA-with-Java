package com.umohsamuel.LinkedList;

import java.util.*;

public class App {
    public static void main(String[] args) {
//        LinkedList<String> names = new LinkedList<>();
//
//        names.add("Samuel");
//        names.add("Shade");
//        names.add("Richard");
//        names.add("Emma");
//        names.add("Favour");
//
        App app = new App();
//        app.printName(names);
//
////        names.remove(2);
////        app.printName(names);
//
//        names.set(2, "Modify Richard");
//        app.printName(names);
//
//        names.add(2, "Before Richard");
//        app.printName(names);


//        Recommmended way is to use List interface

        List<String> rollNames = new ArrayList<>();
        rollNames.add("Samuel");
        rollNames.add("Shade");
        rollNames.add("Oladejo");
        rollNames.add("Umoh");
        rollNames.add("Feranmi");
        rollNames.add("Nifemi");
        rollNames.add("Godwin");

        List<String> names = new LinkedList<>();

        names.add("Samuel");
        names.add("Shade");
        names.add("Richard");
        names.add("Emma");
        names.add("Favour");

        app.printName(rollNames);
        app.printName(names);

//        names.sort(null);
        Collections.sort(names);
        app.printName(names);
//        Collections.reverse(names);
//        app.printName(names);
//        int[] random = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        app.reverseList(random);
//        System.out.println(Arrays.toString(random));
    }

    void printName(List<String> names) {
//        for (String name : names) {
//            System.out.println("Name is " + name);
//        }

//        now lets implement the foreach with iterator interface


//        Iterator<String> list = names.iterator();
//
//        while (list.hasNext()) {
//            System.out.println("Name is " + list.next());
//        }

//        More specifically we can use listiterator
        ListIterator<String> list = names.listIterator();

        while (list.hasNext()) {
            System.out.println("Name is " + list.next());
        }
        System.out.println("******************");
    }

    void reverseList(int[] list) {
        int start = 0;
        int end = list.length - 1;
        for (int i = 0; i <= end; i++) {
            int temp = list[i];
            list[i] = list[end];
            list[end] = temp;
            end--;
        }


//        while (start < end) {
//            int temp = list[start];
//            list[start] = list[end];
//            list[end] = temp;
//
//            start++;
//            end--;
//        }

    }
}
