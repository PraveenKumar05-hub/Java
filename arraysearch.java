import java.util.*;
public class arraysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size:");
        int n = sc.nextInt();
        int flag = 0;
        int[] arr = new int[n];
        System.out.print("Elements are:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Serach Element:");
        int search = sc.nextInt();
        for(int i=0;i<n;i++){
            if(search==arr[i]){
                flag = search;
                break;
            }
        }
        if(flag==search){
            System.out.print("Element Found");
        }
        else{
            System.out.print("Element not Found");
        }
    }
}
