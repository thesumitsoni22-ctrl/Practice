import java.util.Scanner;

public class P34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //OCCURANCE OF AN ELEMENT

        System.out.println("enter the size of an array");
        int n = scanner.nextInt();

        System.out.println("enter the elements in an array");
        int arr[] = new int[n];
        for(int i = 0 ; i <n ; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("enter the element you want to know about occurance");
        int occurance = scanner.nextInt();
        int elementcount = 0;

        for(int i = 0 ; i<n ; i++){
            if(arr[i] == occurance){
                elementcount++;
            }

        }
        System.out.println(elementcount);

        scanner.close();
    }
}