package com.umohsamuel.Multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SomeThread extends Thread {
    private final String name;

    public SomeThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread started, name: " + name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread ended, name: " + name);
    }
}

class SomeThreadWithCountdownlatch extends Thread {
    private final CountDownLatch latch;

    public SomeThreadWithCountdownlatch(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("Thread started, name: " + Thread.currentThread().getName());
        System.out.println("Thread ended, name: " + Thread.currentThread().getName());
        latch.countDown();
    }
}

public class ThreadPools {
    public static void main(String[] args) {
//        ExecutorService es = Executors.newFixedThreadPool(4);
//        SomeThread[] arr = new SomeThread[18];
//        for (int i = 0; i < 18; i++) {
//            String value = "Thread" + i;
//            arr[i] = new SomeThread(value);
//        }
//
//        for (SomeThread thing : arr) {
//            es.execute(thing);
//        }
//
//        es.shutdown();


//        Countdown latch example
        CountDownLatch latch = new CountDownLatch(18);
        ExecutorService es = Executors.newFixedThreadPool(4);
        SomeThreadWithCountdownlatch[] arr = new SomeThreadWithCountdownlatch[18];
        for (int i = 0; i < 18; i++) {
            String value = "Thread" + i;
            arr[i] = new SomeThreadWithCountdownlatch(latch);
        }

        for (SomeThreadWithCountdownlatch thing : arr) {
            es.execute(thing);
        }

        es.shutdown();

        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("This is from the main method");

    }
}
