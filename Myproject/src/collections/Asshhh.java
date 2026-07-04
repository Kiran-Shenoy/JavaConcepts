package collections;
import java.util.Scanner;
public class Asshhh {

public String freqAlphabets(String s) {
        
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i < s.length())
        {
            if(i + 2 < s.length() && s.charAt(i + 2) == '#')
            {
                int num = Integer.parseInt(s.substring(i, i+2));
                sb.append((char) ('a' + num-1));
                i +=3;
            }
            else
            {
              int num = s.charAt(i) -'0';
              sb.append((char) ('a' + num-1));
              i++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Asshhh s = new Asshhh();

        String st = scan.next();

        String r  = s.freqAlphabets(st);

        System.out.print(r);
    }
}
