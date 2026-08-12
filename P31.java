import java.util.Scanner;

public class P31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //REVERSE ARRAY

        System.out.println("enter the size of an array");
        int n = scanner.nextInt();

        System.out.println("enter the elements in an array");
        int arr[] = new int[n];
        for(int i = 0 ; i <n ; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i = n-1 ; i>=0  ; i--){
            System.out.print(arr[i]);
        }

        scanner.close();
    }
}
