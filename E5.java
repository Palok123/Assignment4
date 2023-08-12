import java.util.Scanner;
public class E5 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        String Word = input.next();

           String   FirstHalf = Word.substring(0, Word.length() / 2);
            String LastHalf = Word.substring(Word.length() / 2, Word.length());
            if(Word.length()%2!=0)
            {
                FirstHalf = Word.substring(0, Word.length() / 2);
                LastHalf = Word.substring(Word.length() / 2+1, Word.length());
            }

        if(FirstHalf.equals(LastHalf))
            System.out.println("FirstHalf and LastHalf are same");
        else
            System.out.println("FirstHalf and LastHalf are not same");
    }
}
