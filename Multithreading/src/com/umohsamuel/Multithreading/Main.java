package com.umohsamuel.Multithreading;

import java.util.Random;

//extending threads
class Demo extends Thread {
    private int myNum;

    public Demo(int myNum) {
        this.myNum = myNum;
    }

    public int getMyNum() {
        return myNum;
    }

    public void countForMe() {
        for (int i = 1; i < 10; i++) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Time elapsed is " + i + ", in thread " + getMyNum());
        }
    }

    @Override
    public void run() {
        countForMe();
    }

    @Override
    public String toString() {
        return "Demo{" +
                "myNum=" + myNum +
                '}';
    }


}

//using runnable interface
class Demo2 implements Runnable {
    private int myNum;

    public Demo2(int myNum) {
        this.myNum = myNum;
    }

    public int getMyNum() {
        return myNum;
    }

    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            Random random = new Random();
            try {
                Thread.sleep(random.nextInt(500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("The count is " + i + ", and the thread is " + getMyNum());
        }
    }

    @Override
    public String toString() {
        return "Demo2{" +
                "myNum=" + myNum +
                '}';
    }
}

//demo for showing syncronization of methods in threads
class Demo3 {
    //    this syncronised means no two threads can access it at a time
    synchronized public void counter() {
        for (int i = 1; i < 11; i++) {
            if (i <= 5) {
                System.out.print('[');
            } else System.out.print(']');
        }
        System.out.println();
    }
}

//demo for showing syncronization of Blocks in threads
class Demo4 {
    //    this syncronised means no two threads can access it at a time
    private final Object lock = "lock";

    public void counter() {
        synchronized (lock) {
            for (int i = 1; i < 11; i++) {
                if (i <= 5) {
                    System.out.print('[');
                } else System.out.print(']');
            }
            System.out.println();
        }

        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

//this shows how to implement class level lock and syncronization so as no two instances will work concurrently
class Demo5 {
    //    create an object of class
//    private static final Object lock = Demo4.class;
//or make the method static
    synchronized public static void counter() {

//        and use it to syncronise here
        //    this syncronised means no two threads can access it at a time
//        synchronized (lock) {
        for (int i = 1; i < 11; i++) {
            if (i <= 5) {
                System.out.print('[');
            } else System.out.print(']');
        }
        System.out.println();
//        }

        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
//        Demo demo1 = new Demo(1);
//        Demo demo2 = new Demo(2);
//
//        long startTime = System.currentTimeMillis();
//        demo1.start();
//        System.out.println("********************");
//        demo2.start();
//        try {
//            Thread.sleep(4512);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        long endTime = System.currentTimeMillis();
//        long finalTime = endTime - startTime;
//
//        System.out.println("Total time used to run program is " + finalTime);

//        Thread myThread1 = new Thread(new Demo2(1));
//        Thread myThread2 = new Thread(new Demo2(2));
//
//        myThread1.start();
//        myThread2.start();

//anonymus thread example
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1; i < 10; i++) {
//                    System.out.println("this is me " + i);
//                }
//            }
//        }).start();


//        syncrhronization of the threads
//        Demo5 hello = new Demo5();
//        Demo5 hello2 = new Demo5();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    Demo5.counter();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    Demo5.counter();
                }
            }
        }).start();

    }
}
