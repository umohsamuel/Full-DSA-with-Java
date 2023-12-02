import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int previous = 0;
        int current = 1;
        int count = 2;

        while (count <= num){
            int temp = current;
            current = current + previous;
            previous = temp;

        System.out.print(current + " ");
            count++;
        }

    }
}
