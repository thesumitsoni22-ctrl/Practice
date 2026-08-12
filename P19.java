import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      // Sum of digits

        System.out.println("ENTER DIGITS");
        int digits = scanner.nextInt();
        int sum = 0,rem;

        while(digits > 0){
            rem = digits % 10;
            sum = sum + rem;
            digits = digits / 10;
        }
        System.out.println(sum);
    }
}