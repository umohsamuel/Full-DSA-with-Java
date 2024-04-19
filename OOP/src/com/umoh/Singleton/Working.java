package com.umoh.Singleton;

public class Working {
    private static Working ThisIsDInstance;
    String isItWorking;

    public Working(String isItWorking) {
        this.isItWorking = isItWorking;
    }

    public static Working getInstance() {
        if (ThisIsDInstance == null) {
            ThisIsDInstance = new Working("It is working my G");
        }
        return ThisIsDInstance;
    }
}
