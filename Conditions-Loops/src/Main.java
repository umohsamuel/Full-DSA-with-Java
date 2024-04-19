public class Main {
    public static void main(String[] args) {
//        do while loop
//        int num = 1;
//        do {
//            System.out.println(num);
//            num++;
//        } while (num <= 5);

//        find the maximum number in 3
//        Scanner in = new Scanner(System.in);
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
//        int num3 = in.nextInt();

//        int max = num1;
//
//        if (num2 > max){
//            max = num2;
//        }
//        if (num3 > max){
//            max = num3;
//        }

//        int max = Math.max(num3, Math.max(num1, num2));
//
//        System.out.println(max);


//        check if the output is prime or not

//        Scanner in = new Scanner(System.in);
//
////        int myNum = in.nextInt();
//
//        for (int i = 2; i < 100; i++) {
//            if (isPrime(i)) {
//                System.out.println("prime " + i);
//            }
//        }
//
//    }
//
//        static boolean isPrime ( int numToCheck){
//            if (numToCheck <= 1) {
//                return false;
//            }
//
//            for (int j = 2; j <= Math.sqrt(numToCheck); j++) {
//                if (numToCheck % j == 0) {
//                    return false;
//                }
//            }
//            return true;
//        }

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("@ ");
//            }
//            System.out.println("\n");
//        }

        int x = 1234;
        int sumOfDigits = 0;

        while (x != 0) {
            int oneDigit = x % 10;
            sumOfDigits += oneDigit;
            System.out.println(sumOfDigits);
            x /= 10;
        }

    }
}