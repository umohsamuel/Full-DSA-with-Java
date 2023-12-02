import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        do while loop
//        int num = 1;
//        do {
//            System.out.println(num);
//            num++;
//        } while (num <= 5);

//        find the maximum number in 3
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

//        int max = num1;
//
//        if (num2 > max){
//            max = num2;
//        }
//        if (num3 > max){
//            max = num3;
//        }

        int max = Math.max(num3, Math.max(num1, num2));

        System.out.println(max);

    }
}