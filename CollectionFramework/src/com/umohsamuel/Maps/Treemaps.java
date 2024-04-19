package com.umohsamuel.Maps;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Demo implements Comparable<Demo> {
    private String firstThing;
    private String secondThing;

    public Demo(String firstThing, String secondThing) {
        this.firstThing = firstThing;
        this.secondThing = secondThing;
    }

    public String getFirstThing() {
        return firstThing;
    }

    public String getSecondThing() {
        return secondThing;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "firstThing='" + firstThing + '\'' +
                ", secondThing='" + secondThing + '\'' +
                '}';
    }

    @Override
    public int compareTo(Demo o) {
        String firstCompare = firstThing.concat(secondThing);
        String secondCompare = o.getFirstThing().concat(o.getSecondThing());

        return firstCompare.compareTo(secondCompare);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Demo demo)) return false;
        return Objects.equals(getFirstThing(), demo.getFirstThing()) && Objects.equals(getSecondThing(), demo.getSecondThing());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstThing(), getSecondThing());
    }
}

public class Treemaps {
    public static void main(String[] args) {
//        generally in a custom object or class that you will perform a comparing operation on, you should override the equals and hashmap methods
        Map<Demo, String> map = new TreeMap<>();

        map.put(new Demo("S03", "E04"), "Last");
        map.put(new Demo("S01", "E04"), "Second One");
        map.put(new Demo("S01", "E02"), "First");
        map.put(new Demo("S02", "E02"), "Fourth");
        map.put(new Demo("S01", "E05"), "Third");
        map.put(new Demo("S01", "E04"), "Second Two");

        for (Map.Entry<Demo, String> e : map.entrySet()) {
//            System.out.println("Demo key: " + e.getKey() + ", Value: " + e.getValue());
        }

//        now to retrieve info from it or search
// this is how you search with key
        System.out.println(map.get(new Demo("S03", "E04")));
//    search with value
        for (Map.Entry<Demo, String> e : map.entrySet()) {
            if (e.getValue().equals("Last")) {
                System.out.println(e.getKey());
            }
        }
    }

}
