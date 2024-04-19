package com.umohsamuel.Queue;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) {
//        Queue<String> queue = new ArrayBlockingQueue<>(5);
//        queue.add("Samuel");
//        queue.add("Shade");
//        queue.add("Fola");
//        queue.add("Michael");
//        queue.add("Gabriel");
//
//
//        for (String e : queue) {
//            System.out.println(e);
//        }
//        System.out.println("****************");
//        System.out.println(queue.offer("Egbon"));
//        System.out.println(queue.peek());
//        System.out.println("****************");
//        for (String e : queue) {
//            System.out.println(e);
//        }


        Deque<String> queue = new LinkedBlockingDeque<>();
        queue.add("Samuel");
        queue.add("Shade");
        queue.add("Fola");
        queue.add("Michael");
        queue.add("Gabriel");


        for (String e : queue) {
            System.out.println(e);
        }
        System.out.println("****************");
        System.out.println(queue.offerFirst("Egbon"));
        System.out.println(queue.peekLast());
        System.out.println("****************");
        for (String e : queue) {
            System.out.println(e);
        }


    }
}
