import java.util.Scanner;

public class P32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //COUNT EVEN/ODD ELEMENTS

        System.out.println("enter the size of an array");
        int n = scanner.nextInt();

        System.out.println("enter the elements in an array");
        int arr[] = new int[n];
        for(int i = 0 ; i <n ; i++){
            arr[i] = scanner.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i<n;i++){
            if(arr[i] % 2 == 0){
                System.out.println("ARRAY ELEMENTS ARE EVEN");
                evenCount++;
            }
            else{
                System.out.println("ARRAY ELEMENTS ARE ODD");
                oddCount++;
            }
        }
        System.out.println("even elements in array are : ");
        System.out.println(evenCount);

        System.out.println("odd elements in array are : ");
        System.out.println(oddCount);

        scanner.close();
    }
}
