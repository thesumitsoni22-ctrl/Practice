import java.util.Scanner;
public class P39 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //SORT ARRAY ASCENDING

        System.out.println("enter size of an array : ");
        int n = scanner.nextInt();

        System.out.println("enter the element in an array : ");
        int arr[] = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = scanner.nextInt();
        }

        int temp;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                // Agar pehla element aage wale se bada hai toh swap hoga
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array in ascending order:");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }

        scanner.close();
    }
}
