import java.util.Scanner;
public class P2 {
    public static void main(String[] args){
        // positive negative or zero

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER A NO. :");
        int no = scanner.nextInt();

        if(no > 0){
            System.out.println("NO. IS POSITIVE");
        } else if(no < 0){
            System.out.println("NO. IS NEGATIVE");
        }else{
            System.out.println("NO. IS ZERO");
        }

scanner.close();
    }
}
