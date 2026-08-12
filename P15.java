import java.util.Scanner;
public class P15 {
    public static void main(String[] args){

        //Multiplication table
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER A NUMBER : ");
        int no = scanner.nextInt();

        int n = 0 ;

        for(int i = 1; i <= 10 ; i++){
             n = no * i;
            System.out.println(n);

        }

        scanner.close();
    }
}
