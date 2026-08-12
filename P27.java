import java.util.Scanner;

public class P27 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Sum of array

        System.out.println("enter size of an array : ");
        int n = scanner.nextInt();

        int arr[] = new int[n];
        System.out.println("enter elements in an array : ");
        for(int i = 0; i< n ; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("sum of the given array : ");
        int sum = 0;
        for(int i = 0; i<n;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);

        // multiply
        System.out.println("multiply of the given array : ");
        int mul = 1;
        for(int i = 0; i<n ; i++){
            mul = mul * arr[i];
        }
        System.out.println(mul);
    }
}
