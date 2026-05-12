package encapsulation;
import java.util.Scanner;
public class Occurence {

public int strStr(String haystack, String needle) {
        
        if(haystack.contains(needle))
        {
            return haystack.indexOf(needle);
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Occurence  s = new Occurence();

        String m = scan.next();
        String n = scan.next();

        int r = s.strStr(m,n);

        System.out.print(r);
    }

}
