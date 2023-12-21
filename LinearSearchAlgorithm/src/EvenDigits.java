public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(CountEven(nums));
    }

    static int CountEven(int[] numArr) {
        int evenCount = 0;
        for (int number : numArr) {
            if (isEven(number)) {
                evenCount++;
            }
        }
        return evenCount;
    }

    static boolean isEven(int nums) {
        return numCount(nums) % 2 == 0;
    }

    //    count the individual numbers
    static int numCount(int num) {
        if (num < 0) {
            num = num * -1;
        }

        return (int) (Math.log10(num) + 1);

//        if (num == 0) {
//            return 1;
//        }
//
//        int count = 0;
//        while (num > 0) {
//            count++;
//            num = num / 10;
//        }
//        return count;
    }
}
