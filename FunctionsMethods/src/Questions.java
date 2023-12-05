import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number to check if its prime or not: ");
//        int testNum = in.nextInt();
//        boolean result = IsPrime(testNum);
//        System.out.println(result ? "It is a prime number" : "It is not prime");

        for (int i = 100; i < 1000; i++) {
            if (ArmStrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

//    check if a number is an armstrong number

    static boolean ArmStrong(int Nums) {
        int originalNum = Nums;
        int sum = 0;
        while (Nums > 0) {
            int rem = Nums % 10;
            int remCubed = rem * rem * rem;
            sum = sum + remCubed;
            Nums = Nums / 10;
        }

        return originalNum == sum;

    }

    //    check if a number is a prime number or not
//    static boolean IsPrime(int anyNum) {
//        if (anyNum <= 1) {
//            return false;
//        }
//
//        int ourChecker = 2;
//        while (ourChecker * ourChecker <= anyNum) {
//            if (anyNum % ourChecker == 0) {
//                return false;
//            }
//            ourChecker++;
//        }
//        return ourChecker * ourChecker > anyNum;
//    }
}
