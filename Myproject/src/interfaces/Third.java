package interfaces;
import java.util.Scanner;
import java.util.*;
public class Third {

public String[] findOcurrences(String text, String first, String second) {
        
        String[] word = text.split(" ");
        List<String> res = new ArrayList<>();

        for(int i=0;i<word.length-2;i++)
        {
            if(word[i].equals(first) && word[i+1].equals(second))
            {
                 res.add(word[i+2]);
            }
        }
        return res.toArray(new String[0]);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Third s = new Third();

        String st = scan.nextLine();
        String first = scan.next();
        String second = scan.next();

        String[] r = s.findOcurrences(st,first,second);

      for(String out : r)
        {
            System.out.print(out);
        }
    }

}
