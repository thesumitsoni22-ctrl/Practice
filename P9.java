import java.util.Scanner;

public class P9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER NUMBER : ");
        int num = scanner.nextInt();


            if(num % 5 == 0 && num % 11 == 0){
                System.out.println("NUM IS DIVISIBLE BY BOTH 5 & 11");
            }
            else if(num % 5 == 0){
                    System.out.println(num + " DIVISIBLE BY 5");
                }
            else if(num % 11 == 0){
                    System.out.println(num + " DIVISIBLE BY 11");
                }
            else{
                System.out.println("NOT DIVISIBLE BY 11 OR 5");
            }

        scanner.close();
    }
}
