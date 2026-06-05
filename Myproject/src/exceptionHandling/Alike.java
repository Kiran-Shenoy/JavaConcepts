package exceptionHandling;
import java.util.Scanner;
public class Alike {

    public boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int mid = s.length() / 2;

        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(vowels.indexOf(s.charAt(i)) != -1)
            {
                if( i <  mid )
                {
                    count ++;
                }
                else
                {
                    count --;
                }
            }
        }
        return count == 0;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Alike s = new Alike();

        String st = scan.next();

        boolean r = s.halvesAreAlike(st);

        System.out.print(r);

    }

}
