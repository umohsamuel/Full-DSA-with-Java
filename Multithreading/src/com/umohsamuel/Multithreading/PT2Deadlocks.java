package com.umohsamuel.Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PT2Deadlocks {
    public static void main(String[] args) {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean flagLock1 = false;
                boolean flagLock2 = false;
                boolean checkFlagLock1 = false;
                boolean checkFlagLock2 = false;
                while (true) {
                    try {
                        if (!flagLock1) {
                            flagLock1 = lock1.tryLock();
                        }
                        if (!flagLock2) {
                            flagLock2 = lock2.tryLock();
                        }
                    } finally {
                        if (flagLock1 && !checkFlagLock1) {
                            System.out.println("We are in thread1, lock1");
                            lock1.unlock();
                            checkFlagLock1 = true;
                        }

                        if (flagLock2 && !checkFlagLock2) {
                            System.out.println("We are in thread1, lock2");
                            lock2.unlock();
                            checkFlagLock2 = true;
                        }

                        if (flagLock1 && flagLock2) {
                            System.out.println("now we can use this shit");
                            break;
                        }
                    }

                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean flagLock1 = false;
                boolean flagLock2 = false;
                boolean checkFlagLock1 = false;
                boolean checkFlagLock2 = false;
                while (true) {
                    try {
                        if (!flagLock1) {
                            flagLock1 = lock1.tryLock();
                        }
                        if (!flagLock2) {
                            flagLock2 = lock2.tryLock();
                        }
                    } finally {
                        if (flagLock1 && !checkFlagLock1) {
                            System.out.println("We are in thread2, lock1");
                            lock1.unlock();
                            checkFlagLock1 = true;
                        }

                        if (flagLock2 && !checkFlagLock2) {
                            System.out.println("We are in thread2, lock2");
                            lock2.unlock();
                            checkFlagLock2 = true;
                        }

                        if (flagLock1 && flagLock2) {
                            System.out.println("now we can use this shit");
                            break;
                        }
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
