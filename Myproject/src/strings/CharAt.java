package strings;
import java.util.Scanner;
public class CharAt {

	  public void reverseString(char[] s) {
		    int left =0;
		    int right = s.length -1;

		    while(left < right)
		    {
		        char temp = s[left];
		        s[left] = s[right];
		        s[right] = temp;
		        left++;
		        right--;
		    }
		    }
		    public static void main(String[] args)
		    {
		        Scanner scan = new Scanner(System.in);
		        CharAt s = new CharAt();

		        int n = scan.nextInt();
		        char ss[] = new char[n];
		        for(int i=0;i<n;i++)
		        {
		            ss[i] = scan.next().charAt(0);
		        }

		        s.reverseString(ss);

		        for(int j=0;j<ss.length;j++)
		        {
		            System.out.print(ss[j]);
		        }
		    }

}
