import java.util.Scanner;

public class P23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Fibonacci series

        System.out.println("ENTER A NO. : ");
        int num = scanner.nextInt();

        int a = 0;
        int b = 1;
// ITNA PRINT KRNA HAI
//        for (int i = 0;i <= num ; i++){
//            int c = a + b;
//            System.out.println(a + " ");
//            a = b;
//            b = c;
//        }

// ITNE NO. TK HI PRINT KRNA HAI
        while (a <= num ){
            int c = a + b;
            System.out.println(a + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }
}