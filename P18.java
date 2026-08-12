import java.util.Scanner;

public class P18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// palindrome no
        System.out.println("ENTER A NUMBER : ");
        int num = scanner.nextInt();
        int num1 = num;
        int rem;
        int rev = 0;

        while(num > 0){
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num/10;
        }
        if(num1 == rev) {
            System.out.println(num1 + "is pallindrome");
        }
        else{
            System.out.println(num1 + "is not pallindrome");
        }
        scanner.close();
    }
}