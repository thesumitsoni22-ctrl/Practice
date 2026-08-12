import java.util.Scanner;

public class P28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // largest element

        System.out.println("enter the size of an array");
        int n = scanner.nextInt();

        System.out.println("enter the elements in an array");
        int arr[] = new int[n];
        for(int i = 0 ; i <n ; i++){
              arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for(int i = 0; i<n ; i++){
            if(arr[i] > max){
              max = arr[i];
            }
        }
        System.out.println("the maximum element is " + max);


        scanner.close();
            }
        }

