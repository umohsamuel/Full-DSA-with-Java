public class Main {
    public static void main(String[] args) {
        int[] numArr = {3, 6, 7, 8, 23, 54, 65};
        int target = 23;
        int result = linearSearch(numArr, target);
        System.out.println(result);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int currentValue = arr[index];
            if (currentValue == target) {
                return index;
            }
        }

//        this is hit when it cant find the value in the arr, or it doesn't exist
        return -1;
    }
}