import java.util.Scanner;
public class P35 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //CHECK DUPLICATE

        System.out.println("enter the size of an array");
        int n = scanner.nextInt();

        System.out.println("enter the element iin an array");
        int arr[] = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = scanner.nextInt();
        }

        int hasduplicate = 0;
        for(int i = 0; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
                if(arr[i] == arr[j]){
                    hasduplicate++;
                    System.out.println(arr[i]);
                }
            }
        }

scanner.close();
    }
}
