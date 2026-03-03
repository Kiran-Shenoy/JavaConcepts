package encapsulation;
import java.util.Scanner;
public class Prefix {
public int isPrefixOfWord(String sentence, String searchWord) {
        
        String[] ar = sentence.split(" ");
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i].startsWith(searchWord))
            {
                return i + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Prefix s = new Prefix();

        String st = scan.nextLine();
        String word = scan.next();

        int r = s.isPrefixOfWord(st,word);

        System.out.print(r);
    }

}
