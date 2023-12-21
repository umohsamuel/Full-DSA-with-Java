public class Multidimensionalls {
    public static void main(String[] args) {
        int[][] mularr = {
                {1, 2, 234, 3, 4},
                {5, 6, 7, 8, 999},
                {92, 23, 43, 54, 22}
        };

        int target = 23;
        int result2 = maxValue(mularr);
        System.out.println(result2);

//        int[] result = searcher(mularr, target);
//        System.out.println(Arrays.toString(result));
    }

//    static int[] searcher(int[][] arr, int target) {
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (target == arr[row][col]) {
//                    return new int[]{row, col};
//                }
//            }
//        }
//        return new int[]{-1, -1};
//    }

    static int maxValue(int[][] arr) {
//        int initialValue = Integer.MIN_VALUE;
        int initialValue = arr[0][0]; //can also be done with Integer.MIN_VALUE
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if (initialValue < arr[row][col]) {
//                    initialValue = arr[row][col];
//                }
//            }
//        }

        for (int[] row : arr) {
            for (int col : row) {
                if (initialValue < col) {
                    initialValue = col;
                }
            }
        }
        return initialValue;
    }
}
