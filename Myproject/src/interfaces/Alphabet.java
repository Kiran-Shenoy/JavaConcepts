package interfaces;
import java.util.*;
public class Alphabet {

public boolean checkIfPangram(String sentence) {
        
        Set<Character> set = new HashSet<>();

        for(int i=0;i<sentence.length();i++)
        {
            set.add(sentence.charAt(i));
        }

        if(set.size() == 26)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Alphabet s = new Alphabet();

        String st = scan.next();

        boolean r = s.checkIfPangram(st);

        System.out.print(r);
    }

}
