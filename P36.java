import java.util.Scanner;

public class P36 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // REMOVE DUPLICATES FROM AN ARRAY

        // Input size of the array
        System.out.println("enter the size of an array");
        int n = scanner.nextInt();

        // Input array elements
        System.out.println("enter the elements in an array");
        int arr[] = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = scanner.nextInt();
        }

        // Create a temporary array to store unique elements
        int temp[] = new int[n];
        int j = 0; // Tracks the index of the temp array

        // Loop through each element of the original array
        for(int i = 0; i < n; i++){
            boolean isDuplicate = false;

            // Check if the current element already exists in the temp array
            for(int k = 0; k < j; k++){
                if(arr[i] == temp[k]){
                    isDuplicate = true; // Duplicate found
                    break;
                }
            }

            // If the element is unique, add it to the temp array
            if(!isDuplicate){
                temp[j] = arr[i];
                j++; // Increment the unique element count
            }
        }

        // Print the unique elements
        System.out.println("Array after removing duplicates:");
        for(int i = 0; i < j; i++){
            System.out.println(temp[i]);
        }

        scanner.close(); // Fixed: Added missing semicolon here
    }
}
