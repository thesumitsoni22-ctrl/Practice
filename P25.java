import java.util.Scanner;

public class P25 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        //LCM

                System.out.print("ENTER FIRST NUMBER : ");
                int n1 = scanner.nextInt();
                System.out.print("ENTER SECOND NUMBER : ");
                int n2 = scanner.nextInt();

                // Backup for loop calculation
                int a = n1;
                int b = n2;

                // Step 1: Finding HCF first
                while (b > 0) {
                    int rem = a % b;
                    a = b;
                    b = rem;
                }
                int hcf = a;

                // Step 2: LCM formula using HCF
                int lcm = (n1 * n2) / hcf;

                System.out.println("LCM is : " + lcm);
                scanner.close();
            }
        }
