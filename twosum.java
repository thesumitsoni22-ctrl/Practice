import java.util.Scanner;
public class twosum {
    public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of am array");
        int n = scanner.nextInt();

        System.out.println("Enter the array elements");
        int arr[] = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter a target no. from array element :");
        int target = scanner.nextInt();

        // twosum
        for(int i = 0; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }

        //duplicacy
        System.out.println("the duplicate element is : ");
        for(int i = 0; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }

scanner.close();
    }
}
