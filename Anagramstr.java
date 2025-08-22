import java.util.*;

public class Anagramstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word:");
        String str = sc.next();
        char firstChar=str.charAt(0);
        System.out.println("FirstCharacter: "+firstChar);
    }
}