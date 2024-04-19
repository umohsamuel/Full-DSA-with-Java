package com.InnerClass;

public class Shop {
    public static void main(String[] args) {
        Door open = new Door();

        open.shopStatus();

        System.out.println(open.getLock().isLock());

        open.getLock().setLock(false);

        System.out.println(open.getLock().isLock());
        open.shopStatus();
    }
}
