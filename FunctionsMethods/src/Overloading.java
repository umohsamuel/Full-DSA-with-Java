import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        // so basically overloading means you can have 2 or more functions with same name but must always have different numbers argument or argument type it will run properly and know which functions to run and when to run it
//        String result = testFunc1("Hello");
//        System.out.println("My ress " + result);

        int result = testFunc1(3, "BigSam");
        System.out.println("My ress " + result);
    }

    static int testFunc1(int a, String... props) {
        System.out.println("First function");
        System.out.println(a);
        System.out.println(Arrays.toString(props));
        return a;
    }

    static String testFunc1(String s) {
        System.out.println("Second function");
        System.out.println(s);
        return s;
    }
}
