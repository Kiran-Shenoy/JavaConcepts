package exceptionHandling;
import java.util.*;
public class StringCount {
	public int reverseDegree(String s) {
    
    int sum=0;
    for(int i=0;i<s.length();i++)
    {
        char ch = s.charAt(i);  
        int rev = 26 - (ch - 'a');
        int pos = i+1;
        sum += rev * pos;
    }
    
 return sum;
}
public static void main(String[] args)
{
    Scanner scan = new Scanner(System.in);
    StringCount s = new StringCount();

    String st = scan.next();

    int r = s.reverseDegree(st);

    System.out.print(r);
}

}
