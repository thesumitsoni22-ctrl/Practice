import java.util.Scanner;
public class P38 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //MERGE TWO ARRAY


        System.out.println("enter size of an array : ");
        int n = scanner.nextInt();

        System.out.printf("enter the element in first array : ");
        int arr1[] = new int[n];
        for(int i = 0 ; i<n; i++){
            arr1[i] = scanner.nextInt();
        }

        System.out.printf("enter the element in second array : ");
        int arr2[] = new int[n];
        for(int i = 0 ; i<n; i++){
            arr2[i] = scanner.nextInt();
        }

         int arr3[] = new int[n + n];

        System.out.println("merged array : ");

        for(int i=0; i<n ; i++) { //copy first array
            arr3[i] = arr1[i];
        }

        for(int i = 0; i<n ; i++){
            arr3[n + i] = arr2[i]; //copy second array right after the first array of n no.
        }


for(int i = 0; i< n+n ; i++){
    System.out.println(arr3[i]);
    }

        scanner.close();
    }
}
