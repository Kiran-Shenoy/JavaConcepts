package multiThreading;
import java.util.*;
public class CharArry {

	public String reverseStr(String s, int k) {
        char ar[] = s.toCharArray();
        for(int i=0;i < ar.length; i += 2*k)
        {
            int left =i;
            int right = Math.min(i+ k -1, ar.length-1);
            while(left < right)
            {
                char temp = ar[left];
                ar[left++] = ar[right];
                ar[right--] = temp;
            }
        }
        return new String(ar);

    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        CharArry s = new CharArry();

        String st = scan.next();
        int n = scan.nextInt();

        String r = s.reverseStr(st,n);

        System.out.print(r);
    }

}
