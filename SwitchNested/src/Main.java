import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of all fruits");
            case "Apple" -> System.out.println("Sweet red devil");
            case "Orange" -> System.out.println("My orange nigga");
            case "Grapes" -> System.out.println("Grapes yaayyyy");
            default -> System.out.println("Enter a valid fruit");
        }
    }
}