package com.umohsamuel.Multithreading;

import java.util.concurrent.locks.Lock;

public class ReentrantLock {
    static int counter = 0;
//    static AtomicInteger counter = new AtomicInteger(0);

    static Lock lock = new java.util.concurrent.locks.ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    for (int i = 0; i < 1000; i++) {
                        ReentrantLock.counter++;
//                    counter.incrementAndGet();
                    }
                } catch (Exception e) {
                    System.out.println("The error is " + e);
                } finally {
                    lock.unlock();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    for (int i = 0; i < 1000; i++) {
                        ReentrantLock.counter++;
//                    counter.incrementAndGet();
                    }
                } catch (Exception e) {
                    System.out.println("The error is " + e);
                } finally {
                    lock.unlock();
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
        System.out.println("Counter value is: " + ReentrantLock.counter);
    }
}
