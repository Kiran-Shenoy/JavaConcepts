package arrayprograms;
import java.util.Scanner;
public class ArrayString {

	public int maximumValue(String[] strs) {
        int max=0;
        for(int i=0;i<strs.length;i++)
        {
            if(isDigitOnly(strs[i]))
            {
                int d = Integer.parseInt(strs[i]);
                max = Math.max(d,max);
            }
            else
            {
                int ss = strs[i].length();
                max = Math.max(max,ss);
            }

        }
        return max;
    }
        private boolean isDigitOnly(String s)
        {
            for(int j=0;j<s.length();j++)
            {
                if(!Character.isDigit(s.charAt(j)))
                {
                  return false;
                }
            }
            return true;
        }
    

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayString s = new ArrayString();

        int n = scan.nextInt();
        String st[] = new String[n];
        for(int i=0;i<n;i++)
        {
            st[i]= scan.next();
        }

        int r = s.maximumValue(st);

        System.out.print(r);

    }

}
