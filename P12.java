import java.util.Scanner;
public class P12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //N to 1 print

        System.out.println("ENTER A NUMBER : ");
        int num = scanner.nextInt();

        for(int i = num; i >= 0; i--){
            System.out.println(i);
        }

        scanner.close();
    }
}
