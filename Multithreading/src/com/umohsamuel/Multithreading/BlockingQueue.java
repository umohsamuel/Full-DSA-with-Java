package com.umohsamuel.Multithreading;

import java.util.concurrent.ArrayBlockingQueue;

class Produce implements Runnable {
    private final ArrayBlockingQueue<Integer> queue;

    public Produce(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public ArrayBlockingQueue<Integer> getQueue() {
        return queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
                getQueue().put(BlockingQueue.counter++);
                System.out.println("Added: " + BlockingQueue.counter);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consume implements Runnable {
    private final ArrayBlockingQueue<Integer> queue;

    public Consume(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public ArrayBlockingQueue<Integer> getQueue() {
        return queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                getQueue().take();
                BlockingQueue.counter--;
                System.out.println("Removed: " + BlockingQueue.counter);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

public class BlockingQueue {
    static int counter = 1;

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Produce produce = new Produce(queue);
        Consume consume = new Consume(queue);

        Thread thread1 = new Thread(produce);
        Thread thread2 = new Thread(consume);

        thread1.start();
        thread2.start();
    }
}
