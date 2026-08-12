import java.util.Scanner;
public class P5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // LEAP YEAR

        System.out.println("ENTER A YEAR : ");
        int year = scanner.nextInt();

        if(year % 400 == 0) {
            System.out.println("YEAR IS A LEAP CENTURY");
        }
        else if (year % 100 == 0) {
            System.out.println("YEAR IS NOT A LEAP YEAR");
        }
        else if(year % 4 == 0){
                System.out.println("YEAR IS A LEAP YEAR");
            }
        else{
                System.out.println("YEAR IS NOT A LEAP YEAR");
            }
        }
    }

