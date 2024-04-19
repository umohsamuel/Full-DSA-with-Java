package com.umohsamuel.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        note that hashmap doesnt gaurantee the order of the list
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Samuel");
        map.put(7, "Shade");
        map.put(5, "Ade");
        map.put(4, "Bisi");
        map.put(10, "Kaleb");
        map.put(9, "Dolapo");

//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println("Key is: " + entry.getKey() + ", Value is: " + entry.getValue());
//        }

//        trying it with iterator

        Iterator<Map.Entry<Integer, String>> entry = map.entrySet().iterator();

        while (entry.hasNext()) {
            Map.Entry<Integer, String> temp = entry.next();
            System.out.println("Key is: " + temp.getKey() + ", Value is: " + temp.getValue());
        }
    }
}
