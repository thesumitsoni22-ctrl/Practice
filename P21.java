import java.util.Scanner;

public class P21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prime

        System.out.println("ENTER A NO.");
        int num = scanner.nextInt();
        int count = 0;

        for(int i = 1;i <= num;i++){
           if(num % i == 0){
               count++;
           }
        }
        if(count == 2){
            System.out.println("NO. IS PRIME");
        }
        else{
            System.out.println("NO. IS NOT PRIME");
        }
     }
}