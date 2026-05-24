package interfaces;
import java.util.Scanner;
public class AbsoluteDiffer {

public boolean isAdjacentDiffAtMostTwo(String s) {
        
        for(int i=0;i<s.length()-1;i++)
        {
            int current = s.charAt(i) -'0';
            int next = s.charAt(i+1) -'0';
            if(Math.abs(current - next) > 2)
            {
                    return false;
            }
        }
        return true;
   }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        AbsoluteDiffer s = new AbsoluteDiffer();

        String st = scan.next();

        boolean r = s.isAdjacentDiffAtMostTwo(st);

        System.out.print(r);
    }

}
