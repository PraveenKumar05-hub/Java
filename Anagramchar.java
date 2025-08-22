import java.util.*;

public class Anagramchar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        char[] ch1 = String.valueOf(n1).toCharArray();
        char[] ch2 = String.valueOf(n2).toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("It is a Anagram");
        }
        else{
            System.out.println("It is not a Anagram");
        }
    }
}