package com.umohsamuel.Multithreading;

public class WaitAndNotify {

    public static int balance = 0;

    public static void main(String[] args) {
        WaitAndNotify app = new WaitAndNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                app.withdraw(1000);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                app.deposit(2000);
                thread1.interrupt();
            }
        });

        thread1.start();
        thread2.start();
    }

    void withdraw(int amount) {
        System.out.println("Please wait as we help you with your withdrawal");
        synchronized (this) {
            if (balance <= 0 || balance < amount) {
                try {
                    wait();
                    System.out.println("Balance is too low to withdraw, waiting until balance is updated");
                } catch (InterruptedException e) {
                    balance -= amount;
                    System.out.println("Withdrawal successful, current balance is now: " + balance);
                }
            }
        }
    }

    void deposit(int amount) {
        System.out.println("Amount is being deposited, wait for confirmation");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        balance += amount;
        System.out.println("Deposit successful, current balance is: " + balance);
//        if using notify, it can be done like this but when using interrupt we have to have a refrence to the thread
//        synchronized (this) {
//            notify();
//        }
    }
}
