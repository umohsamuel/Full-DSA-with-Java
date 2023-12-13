import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        arrays and 2d arrays
        Scanner in = new Scanner(System.in);
        int[][] my2darr = new int[3][3];


        for (int row = 0; row < my2darr.length; row++) {
            for (int col = 0; col < my2darr[row].length; col++) {
                my2darr[row][col] = in.nextInt();
            }
        }

        for (int[] ard : my2darr) {
            System.out.println(Arrays.toString(ard));
        }

    }
}