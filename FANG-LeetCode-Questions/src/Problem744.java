//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class Problem744 {
    public static void main(String[] args) {

    }

    static int SmallestLetter(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[arr.length - 1]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return start;
    }
}
