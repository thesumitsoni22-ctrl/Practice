import java.util.Scanner;

public class P14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //  Factorial

        int fact = 1;
        System.out.println("ENTER A NUMBER : ");
        int num = scanner.nextInt();

        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        System.out.println(fact);
        scanner.close();
    }
}
