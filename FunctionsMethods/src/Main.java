import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        sum();
//        int answer = secondSum();
//        System.out.println("My nigga " + answer);
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your first and second number: ");
        int firstNum = in.nextInt();
        int secondNum = in.nextInt();
        int answer = thirdSum(firstNum, secondNum);
        System.out.println("Your sum is: " + answer);
    }

    // what if you want to pass the value of the numbers when you are calling the method in main?
    static int thirdSum(int a, int b) {
//        int sum = a + b;
        return a + b;
    }

    // returning the value
    static int secondSum() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        num2 = in.nextInt();

        sum = num1 + num2;

        return sum;
    }

    //no return
    static void sum() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        num2 = in.nextInt();

        sum = num1 + num2;
        System.out.println("Sum of both is: " + sum);

    }
}