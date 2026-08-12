import java.util.Scanner;
public class P13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Sum of 1 to N
        System.out.println("ENTER A NUMBER : ");
        int num = scanner.nextInt();

        int sum = 0;

        for(int i = 1; i <= num; i++){
            sum = sum + i;
            //System.out.println(sum);
        }
        System.out.println(sum);

        scanner.close();
    }
}
