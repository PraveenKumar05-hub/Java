import java.util.*;
public class strsentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        String sentence = sc.nextLine();    //Input Sentence
        String[] c = sentence.split(",");    //Split sentence into words

        System.out.println("Words in the Sentence: ");
        for(int i = 0;i<c.length;i++){
            System.out.print(c[i]);     // print each word
        }
    }
}
