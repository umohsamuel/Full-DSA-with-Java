package com.Generics;

import java.util.List;

class GenericClass<T> {
    private T genericData;

    public GenericClass(T genericData) {
        this.genericData = genericData;
    }

    public T getGenericData() {
        return genericData;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "genericData=" + genericData +
                '}';
    }
}


class GenericMethod {

    public <E> void printList(List<E> list) {
        for (E element : list) {
            System.out.println(element);
        }
    }

    public <E> void printArray(E[] arr) {
        for (E element : arr) {
            System.out.println(element);
        }
    }
}

class GenericClassAndMethod<K extends Number, V extends App> {
    private K key;
    private V value;

    public GenericClassAndMethod(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public <E extends Character, N extends Integer> void display(E element, N number) {
        System.out.println("Your money is: " + element + number);
    }

    @Override
    public String toString() {
        return "GenericClassAndMethod{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

public class App {
    public static void main(String[] args) {
//        GenericClass<String> generic = new GenericClass<>("This is a String");
//
//        String data = generic.getGenericData();
//        System.out.println(data);

//        GenericMethod genmethod = new GenericMethod();
//
//        List<String> rollnames = new ArrayList<>();
//        rollnames.add("One");
//        rollnames.add("Two");
//        rollnames.add("Three");
//        rollnames.add("Four");
//        rollnames.add("Five");
//        rollnames.add("Six");
//
//        genmethod.printList(rollnames);
//
//        System.out.println("**************");
//        Integer[] rollnumber = new Integer[10];
//        for (int i = 0; i < rollnumber.length; i++) {
//            rollnumber[i] = i + 1;
//        }
//        genmethod.printArray(rollnumber);

//        Integer num = 10;
//        divide(num);
//        System.out.println(num);
//
//        Integer[] sam = {1, 2, 3};
//        modify(sam);
////        System.out.println(Arrays.toString(sam));
//
//        show(sam);

//        GenericClassAndMethod<Integer, App> oga = new GenericClassAndMethod<>(1, new App());
//
//        oga.display('$', 2000000);
//        System.out.println(oga.getKey());
//        Integer num = 10;
//        System.out.println(oga.getValue().divide(num));
//        System.out.println(num);
    }

    static void modify(Integer[] x) {
        x[0] = 200;
    }

    static <E> void show(E[] num) {
        System.out.println("************** here");
        for (E element : num) {
            System.out.println(element);
        }
    }

    int divide(Integer x) {
        return x = x / 2;
    }
}
