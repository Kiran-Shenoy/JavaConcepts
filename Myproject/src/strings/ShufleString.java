package strings;
import java.util.Scanner;
public class ShufleString {

	public String restoreString(String s, int[] indices) {
		   
        char ss[] = new char[s.length()];
        for(int i=0;i<indices.length;i++)
        {
         ss[indices[i]]= s.charAt(i);
        }

        return new String(ss);

 }
 public static void main(String[] args)
 {
     Scanner scan = new Scanner(System.in);
     ShufleString s = new ShufleString();

     String st = scan.next();
     int n = scan.nextInt();
     int a[] = new int[n];
     for(int i=0;i<n;i++)
     {
         a[i] = scan.nextInt();
     }

     String r = s.restoreString(st,a);

     System.out.print(r);
 }

}
