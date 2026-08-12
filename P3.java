import java.util.Scanner;
public class P3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //even odd
        System.out.println("ENTER A NUM:");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("NO IS EVEN");
        }
        else{
            System.out.println("NO IS ODD");
        }
        scanner.close();
    }
}
