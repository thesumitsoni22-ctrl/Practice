import java.util.Scanner;
public class P10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Absolute value without using built-in method

        System.out.println("ENTER THE NUMBER");
        int num = scanner.nextInt();

        if(num < 0){
            num = -(num);
            System.out.println(num);
        }
        else{
            System.out.println(num);
        }

     scanner.close();;
    }
}
