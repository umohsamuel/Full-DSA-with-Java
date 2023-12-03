import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int EmpID = in.nextInt();
        String department = in.next();


//        switch (EmpID) {
//            case 1:
//                System.out.println("BigSam");
//                break;
//
//            case 2:
//                System.out.println("Folashade");
//                break;
//
//            case 3:
//                System.out.println("Him");
//                switch (department) {
//                    case "IT":
//                        System.out.println("Computer Science with Mathematics");
//                        break;
//                    case "Mechanic":
//                        System.out.println("Try harder");
//                        break;
//                    default:
//                        System.out.println("Enter valid Department");
//                }
//                break;
//
//            default:
//                System.out.println("Enter valid EmpID");
//        }
//
        // better way to write
        switch (EmpID) {
            case 1 -> System.out.println("BigSam");
            case 2 -> System.out.println("Folashade");
            case 3 -> {
                System.out.println("Him");
                switch (department) {
                    case "IT" -> System.out.println("Computer Science with Mathematics");
                    case "Mechanic" -> System.out.println("Try harder");
                    default -> System.out.println("Enter valid Department");
                }
            }
            default -> System.out.println("Enter valid EmpID");
        }
    }
}
