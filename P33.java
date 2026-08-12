import java.util.Scanner;

public class P33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //SEARCH AN ELEMENT

        System.out.println("enter the size of an array");
        int n = scanner.nextInt();

        System.out.println("enter the elements in an array");
        int arr[] = new int[n];
        for(int i = 0 ; i <n ; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("enter the element to be searched from an array");
        int target = scanner.nextInt();
        int i = 0;
        for( i=0; i<n ; i++){
            if(target == arr[i]){
                System.out.println("element searched");
                break;
            }
        }
        // Agar loop poora chal gaya aur break nahi hua, toh i ki value n ho jayegi
        if(i == n){
            System.out.println("element not exist");
        }

        scanner.close();
    }
}
