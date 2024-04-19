package com.InnerClass.LocalInner;

public class Door {
    private final Lock lock = new Lock() {
        @Override
        public boolean isUnlocked(String key) {
            return !key.equals("qwerty");
        }
    };

    //    public boolean isLocked(String key) {
//        class Lock {
//            private boolean isLocked(String key) {
//                return !key.equals("qwerty");
//            }
//        }
//        return new Lock().isLocked(key);
//    }
    int x = 4;

    public Lock getLock() {
        return lock;
    }

    public final void speech() {
        System.out.println("I am speaking");
    }
}
