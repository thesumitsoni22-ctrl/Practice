import java.util.Scanner;
public class P37 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //COPY ONE ARRAY INTO ANOTHER

        System.out.println("enter the size of first array");
        int n = scanner.nextInt();

        System.out.println("enter the element in an first array");
        int arr[] = new int[n];
        for(int i=0; i<n ; i++){
           arr[i] = scanner.nextInt();
        }
 int arr2[] = new int[n] ;

        // copying array

       for(int i =0 ; i<n ; i++){
           arr2[i] = arr[i];
       }

        System.out.println("the copied array is : ");
       for(int i =0 ; i<n ; i++) {

           System.out.println(arr2[i]);
       }

scanner.close();
    }
}
