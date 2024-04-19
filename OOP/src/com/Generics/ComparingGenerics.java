package com.Generics;

class Test<T extends Comparable<T>> implements Comparable<T> {
    private T customVariable;

    public Test(T customVariable) {
        this.customVariable = customVariable;
    }

    public T getCustomVariable() {
        return customVariable;
    }

    @Override
    public String toString() {
        return "Test{" +
                "customVariable=" + customVariable +
                '}';
    }

    @Override
    public int compareTo(T o) {
        return getCustomVariable().compareTo(o);
    }
}

public class ComparingGenerics {
    public static void main(String[] args) {
        Test<Integer> test = new Test<>(1);
        System.out.println(test.compareTo(0));
    }
}
