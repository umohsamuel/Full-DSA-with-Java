package com.exceptionHandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

//        Main mainobj = new Main();
//
//        System.out.println(mainobj.divide(x, y));
//        try {
//            System.out.println(mainobj.divide(x, y));
//        } catch (Exception e) {
//            System.out.print("The error you encountered was: ");
//            System.out.println(e.getMessage());
//        }

        Main vibe = new Main();
        int whatIGet = vibe.divide(x, y);
        System.out.println(whatIGet);
    }

    int divide(int up, int down) {
//        if (down == 0) {
//            return 0;
//        }
        int result;
        try {
            result = up / down;
        } catch (Exception e) {
            System.out.println("Your ran into this error: " + e);
            result = 0;
        } finally {
            System.out.println("This will always execute no matter the outcome and it'll be last");
        }
        return result;
    }
}
