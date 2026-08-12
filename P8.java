import java.util.Scanner;
public class P8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER THE MARKS : ");
        int marks = scanner.nextInt();

        if(marks >= 90){
            System.out.print("Grade " + 'A');
        }else if(marks >= 70){
            System.out.print("Grade " + 'B');
        }else if(marks >= 50){
            System.out.print("Grade " + 'C');
        }else if(marks >= 35){
            System.out.print("Grade " + 'D');
        }else{
            System.out.print("Fail");
        }
        scanner.close();
    }
}
