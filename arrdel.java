import java.util.Scanner;

public class arrdel {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.print("Original array: ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int pos = 2; // delete element at index 2 (3rd element)

        for(int j = pos;j<n-1;j++){
            arr[j] = arr[j+1];
        }

        n--; // reduce size logically

        System.out.print("Array after deletion: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
