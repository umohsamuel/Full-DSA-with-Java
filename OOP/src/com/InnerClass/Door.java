package com.InnerClass;

public class Door {
    private Lock lock;

    public Door() {
        this.lock = new Lock(true);
    }

    public void shopStatus() {
        if (getLock().isLock()) {
            System.out.println("The shop is currently locked, come back later");
        } else {
            System.out.println("The shop is open for business");
        }
    }

    public Lock getLock() {
        return this.lock;
    }


    public class Lock {
        private boolean lock;

        public Lock(boolean lock) {
            this.lock = lock;
        }

        public boolean isLock() {
            return this.lock;
        }

        public void setLock(boolean lock) {
            this.lock = lock;
        }
    }
}
