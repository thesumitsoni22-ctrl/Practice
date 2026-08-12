import java.util.Scanner;
public class P20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Armstrong

        System.out.println("ENTER A NUMBER : ");
        int num = scanner.nextInt();

        int originalnum = num;

        int sum = 0;
        while(num>0){
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        System.out.println(sum);

        if(sum == originalnum){
            System.out.println("NO. IS ARSTRONG");
        }
        else{
            System.out.println("NO. IS NOT ARMSTRONG");
        }
        scanner.close();
    }
}
