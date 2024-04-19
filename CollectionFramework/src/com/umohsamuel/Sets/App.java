package com.umohsamuel.Sets;

import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        Set<String> set = new LinkedHashSet<>();
        Set<String> set = new TreeSet<>();

        for (int i = 30; i > 0; i--) {
            set.add("A" + i);
        }

        for (String num : set) {
            System.out.println(num);
        }

        System.out.println(set.contains("A29"));
    }
}
