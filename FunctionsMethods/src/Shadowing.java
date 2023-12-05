public class Shadowing {
    static int x = 90;

    public static void main(String[] args) {
        System.out.println(x);
//        showdowing occurs when you declare and initialize a variable that has been done in higher other before
        int x = 69;
        System.out.println(x);
        randomFunc();
    }

    static void randomFunc() {
        System.out.println(x);
    }
}
