//import javax.swing.*;
import java.util.Scanner;

public class P30 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Second largest element

        System.out.println("enter the size of an array");
        int n = scanner.nextInt();

        System.out.println("enter the elements in an array");
        int arr[] = new int[n];
        for(int i = 0 ; i <n ; i++){
            arr[i] = scanner.nextInt();
        }

        int max1 = arr[0];
        int max2 = arr[0];

        for(int i = 0; i<n ; i++){
            if(arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2 && arr[i] != max1){
                max2 = arr[i];
                }
            }

        System.out.println("the second largest element is " + max2);


        scanner.close();
    }
}

