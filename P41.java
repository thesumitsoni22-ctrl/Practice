import java.util.Scanner;
public class P41 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        //FIND MISSING NUMBER FROM 1 TO N

        System.out.println("enter the size of an array : ");
        int n = scanner.nextInt();

        System.out.println("enter the elements in an array in sequence : ");
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }

        // jaise array ka size n hai, toh real no. n se  total n+1 tak hoga
        int N = n + 1;
        int totalSum = (N * (N + 1)) / 2;

        //Missing number dono sums ka difference hai = mean phle wale sum me sare array ke element
        // ka sum hai and total wale me maths ka formula lga hai n no. tk sum wala.
        int missingNumber = totalSum - sum;

        System.out.println("The missing number is: " + missingNumber);


        scanner.close();
    }
}
