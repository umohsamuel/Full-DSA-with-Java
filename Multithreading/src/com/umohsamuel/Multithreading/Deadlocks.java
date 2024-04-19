package com.umohsamuel.Multithreading;

public class Deadlocks {
    public static void main(String[] args) {
        final String lock1 = "lock1";
        final String lock2 = "lock2";

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1) {
                    System.out.println("We are in thread1, lock1");

                    synchronized (lock2) {
                        System.out.println("We are in thread1, lock2");
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2) {
                    System.out.println("We are in thread2, lock2");

                    synchronized (lock1) {
                        System.out.println("We are in thread2, lock1");
                    }
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("We are in main");
    }
}
