import java.util.Scanner;

public class P16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // count digit

        System.out.println("ENTER A NUMBER : ");
        int num = scanner.nextInt();
        int count = 0;

       while(num > 0){
           num = num/10;
            count++;
        }
        System.out.println(count);
    }
}
