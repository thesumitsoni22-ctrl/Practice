import java.util.Scanner;

public class P22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prime no btw 1 and N

        System.out.println("ENTER A NO.");
        int num = scanner.nextInt();

        for(int i = 1; i<= num ; i++){
            int count = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }

            }
            if(count == 2){
                System.out.println(i + " ");
            }
        }
        System.out.println();
        scanner.close();
    }
}