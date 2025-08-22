import java.util.*;
public class revsent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sent = sc.nextLine();
        String[] words = sent.split(" ");
        String reversed = "";
        for(int i=words.length-1;i>=0;i--){
            reversed +=words[i] + " ";
        }
        System.out.println("Reversed Sentence: "+reversed);
    }
}
//try
