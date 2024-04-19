package com.umohsamuel.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(23);
        stack.push(32);
        stack.push(45);
        stack.push(56);
        stack.push(67);
        stack.push(98);
        stack.push(100);


        System.out.println(stack.peek());
        System.out.println("**************");
        for (Integer numbers : stack) {
            System.out.println(numbers);
        }

        System.out.println("************");
        System.out.println(stack.search(45));

        System.out.println(stack.isEmpty());

    }
}
