public class InfiniteArr {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;

        System.out.println(indexFinder(arr, target));
    }

    static int indexFinder(int[] arr, int target) {
//        so were to first start with the first box of size 2
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
//            we used temp start here because we would not like to modify the value of start just yet, we want to use it to derive the value for the next end
            int TempStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = TempStart;
        }

        return BinarySearch(arr, target, start, end);
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
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

        return -1;
    }
}
