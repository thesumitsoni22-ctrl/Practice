import java.util.InputMismatchException;
import java.util.Scanner;
public class P6 {
    public static void main(String[] args) {


        try {

            Scanner scanner = new Scanner(System.in);

            //CALCULATOR USING SWITCH

            System.out.print("ENTER FIRST NUM1 :");
            int num1 = scanner.nextInt();

            System.out.print("ENTER FIRST NUM2 :");
            int num2 = scanner.nextInt();

            System.out.println("ENTER OPERATIONS(+,-,*,%,/) : ");
            char op = scanner.next().charAt(0);

            switch (op) {

                case '+' -> System.out.println(num1 + num2);
                case '-' -> System.out.println(num1 - num2);
                case '*' -> System.out.println(num1 * num2);
                case '%' -> System.out.println(num1 % num2);
                case '/' -> System.out.println(num1 / num2);
                default -> System.out.println("INVALID OPERATIONS");
            }
        } catch (ArithmeticException e) {
            System.out.println("CANNOT BE DIVISIBLE BY 0");
        } catch (InputMismatchException e) {
            System.out.println("ERROR ! PLEASE ENTER VALID INTEGERS ONLY");
        }
    }}

        //SIMPLE METHOD
//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.print("ENTER FIRST NUM1 : ");
//        if (!scanner.hasNextInt()) {
//            System.out.println("ERROR ! PLEASE ENTER VALID INTEGERS ONLY");
//            scanner.close();
//        }
//        int num1 = scanner.nextInt();
//
//        System.out.print("ENTER FIRST NUM2 : ");
//        if (!scanner.hasNextInt()) {
//            System.out.println("ERROR ! PLEASE ENTER VALID INTEGERS ONLY");
//            scanner.close();
//        }
//        int num2 = scanner.nextInt();
//
//        System.out.println("ENTER OPERATIONS (+,-,*,%,/) : ");
//        char op = scanner.next().charAt(0);
//
//        switch (op) {
//            case '+' -> System.out.println("RESULT: " + (num1 + num2));
//            case '-' -> System.out.println("RESULT: " + (num1 - num2));
//            case '*' -> System.out.println("RESULT: " + (num1 * num2));
//
//            case '%' -> {
//                if (num2 != 0) {
//                    System.out.println("RESULT: " + (num1 % num2));
//                } else {
//                    System.out.println("CANNOT BE DIVISIBLE BY 0");
//                }
//            }
//
//            case '/' -> {
//                if (num2 != 0) {
//                    System.out.println("RESULT: " + (num1 / num2));
//                } else {
//                    System.out.println("CANNOT BE DIVISIBLE BY 0");
//                }
//            }
//
//            default -> System.out.println("INVALID OPERATIONS");
//        }
//
//        scanner.close();
//
//
//    }
//}
