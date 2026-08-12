import java.util.Scanner;

public class P17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // reverse a number

        System.out.println("ENTER A NUMBER : ");
        int num = scanner.nextInt();

        int rem;
        int rev = 0;

        while(num >0){
            rem = num % 10;
            rev =(rev * 10)+ rem;
            num = num/10;
        }
        System.out.println(rev);
    }
}