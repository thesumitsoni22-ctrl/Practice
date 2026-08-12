import java.util.Scanner;

public class P26 {
    public static void main(String[] args){

//Array input/output
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of an array : ");
        int n = scanner.nextInt(); // size iput liya

        int arr[] = new int[n]; // ye khali box banaya array ka
        System.out.println("enter the elements in an array : ");
        for(int i = 0; i<n ; i++){
            arr[i] = scanner.nextInt(); // box me values dali
        }

        System.out.println("show elements of an array : ");
        for(int i = 0; i< n; i++){
            System.out.println(arr[i]); // values ko print kraya
        }

        scanner.close();
    }
}
