import java.util.Scanner;
public class P1 {
    public static void main(String[] args){

        // two no. ka sum,diff,mul,div

        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER FIRST NUM1 :");
        int num1 = scanner.nextInt();

        System.out.print("ENTER FIRST NUM2 :");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int multiply = num1 * num2;
        int division = num1 % num2;
        int modulus = num1 / num2;


        System.out.println(sum);
        System.out.println(difference);
        System.out.println(multiply);
        System.out.println(division);
        System.out.println(modulus);

        scanner.close();
    }
}
