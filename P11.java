import java.util.Scanner;
    public class P11 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //1 to N print
        System.out.println("ENTER A NUMBER : ");
        int num = scanner.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.println(i);
        }

      scanner.close();
    }
}
