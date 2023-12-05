import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(12, 24, "BigSam", "Hello", "mynigga");
    }

    static void fun(int a, int b, String... v) {
        System.out.println("A is: " + a);
        System.out.println("B is: " + b);
        System.out.println(Arrays.toString(v));
    }
}
