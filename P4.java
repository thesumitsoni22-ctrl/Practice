import java.util.Scanner;
public class P4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // largest among three no.

        System.out.println("ENTER NUM1");
        int num1 = scanner.nextInt();

        System.out.println("ENTER NUM2");
        int num2 = scanner.nextInt();

        System.out.println("ENTER NUM3");
        int num3 = scanner.nextInt();
// equal ke liye
        if(num1 == num2 && num1 == num3){
            System.out.println("ALL NUMS ARE EQUAL");
            //num1 liye
        } else if (num1 >= num2 && num1 >= num3){
            if(num1 == num2 ){
                System.out.println("NUM1 AND NUM2 ARE LARGEST & EQUAL ");
            } else if(num1 == num3){
                System.out.println("NUM1 AND NUM3 ARE LARGEST & EQUAL");
            }else{
                System.out.println("NUM1 IS LARGEST");
            }
        }
        // num2 liye
        else if (num2 >= num1 && num2 >= num3){
            if(num2 == num1 ){
                System.out.println("NUM2 AND NUM1 ARE LARGEST & EQUAL ");
            } else if(num2 == num3){
                System.out.println("NUM2 AND NUM3 ARE LARGEST & EQUAL");
            }else{
                System.out.println("NUM2 IS LARGEST");
            }
        }
        //num3 liye
        else{
            System.out.println("NUM3 IS LARGEST");
        }

        scanner.close();
    }
}
