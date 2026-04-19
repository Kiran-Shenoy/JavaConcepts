package exceptionHandling;
import java.util.Scanner;
public class CountVowel {

    public int vowelConsonantScore(String s) {
        int v = 0;
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
            {
                if("aeiou".indexOf(ch) != -1)
                {
                  v++;
                } else {
                    c++;
                }
            }
        }
        int res=0;
        if(c>0)
        {
     res = (int) Math.floor((double)v/c);
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        CountVowel  s = new CountVowel();

        String st = scan.next();

        int r = s.vowelConsonantScore(st);

        System.out.print(r);
    }

}
