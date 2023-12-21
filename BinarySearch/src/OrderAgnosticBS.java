public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] myCustomArr = {1, 6, 8, 23, 54, 86, 96, 123, 234};
        int[] myCustomArr = {234, 200, 180, 145, 123, 98, 78, 57, 32, 1};
        int target = 145;
        System.out.println(AgnosticBS(myCustomArr, target));
    }

    static int AgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAscending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else end = mid - 1;
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else start = mid + 1;
            }
        }

        return -1;
    }
}
