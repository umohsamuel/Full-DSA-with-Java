public class Main {
    public static void main(String[] args) {
        int[] myCustomArr = {1, 6, 8, 23, 54, 86, 96, 123, 234};
        int target = 8;
        System.out.println(binaryS(myCustomArr, target));
    }

    static int binaryS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

//            were using arr[mid] to access the actual value of the middle index in the array for comparison, and were returning mid for the index of the result in the arr
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else return mid;
        }

        return -1;
    }
}