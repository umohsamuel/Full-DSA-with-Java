import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println(a + " " + b);

//        primitive data types are passed by value

//        String name = "Samuel Umoh";
//        ChangeName(name);
//        System.out.println(name);

//        non-primitive data types are passed by the value of the reference
        int[] numsArray = {1, 2, 3, 4, 5, 6};
        mynums(numsArray);
        System.out.println(Arrays.toString(numsArray));

    }

//    static String ChangeName(String naam) {
//        naam = "bigSammm";
//        return naam;
//    }

    static int[] mynums(int[] yeahh) {
        yeahh[0] = 69;
        return yeahh;
    }

}
