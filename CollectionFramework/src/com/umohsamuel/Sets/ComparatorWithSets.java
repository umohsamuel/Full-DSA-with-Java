package com.umohsamuel.Sets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Test<K, V> {
    private K key;
    private V value;

    public Test(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Test{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

public class ComparatorWithSets {
    public static void main(String[] args) {
        Comparator<Test<Integer, String>> COMPARE_KEY = new Comparator<>() {
            @Override
            public int compare(Test<Integer, String> o1, Test<Integer, String> o2) {
//                return Integer.compare(o1.getValue().length(), o2.getValue().length());
                if (o1.getValue().length() > o2.getValue().length()) {
                    return 1;
                } else if (o1.getValue().length() < o2.getValue().length()) {
                    return -1;
                } else return 0;
            }
        };

        Set<Test<Integer, String>> set = new TreeSet<>(COMPARE_KEY);

        set.add(new Test<>(1, "o"));
        set.add(new Test<>(2, "two"));
        set.add(new Test<>(3, "te"));
        set.add(new Test<>(4, "foour"));
        set.add(new Test<>(5, "fve"));

        for (Test<Integer, String> thing : set) {
            System.out.println("It is " + thing);
        }
    }
}
