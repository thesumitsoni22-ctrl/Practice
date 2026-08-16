import java.util.Scanner;
public class P42 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        //FIND COMMON ELEMENT IN TWO ARRAY

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

        int common = 0;

        for(int i1 =0 ; i1< n ; i1++) {
            for (int i2 = 0; i2 < n; i2++) {
                if (arr1[i1] == arr2[i2]) {
                    common++;
                    System.out.println(arr1[i1]);
                    break;
                }
            }
        }
        scanner.close();
            }
        }


