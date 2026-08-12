import java.util.Scanner;

public class P24 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

                System.out.print("ENTER FIRST NUMBER : ");
                int a = scanner.nextInt();
                System.out.print("ENTER SECOND NUMBER : ");
                int b = scanner.nextInt();

                // Main HCF Loop: Euclid's remainder method
                while (b > 0) {
                    int rem = a % b; // Remainder nikaala
                    a = b;           // Shifting variables
                    b = rem;
                }

                System.out.println("HCF is : " + a); // Loop rukne par 'a' hi HCF hota hai
                scanner.close();
            }
        }

