package encapsulation;
import java.util.Scanner;
public class Consecutive {

public int maxPower(String s) {
        
        int streak= 1;
        int power =1;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i+1) == s.charAt(i))
            {
                streak++;
            }
            else
            {
                streak=1;
            }
            if(streak > power)
            {
                power = streak;
            }
        }
        return power;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Consecutive s = new Consecutive();

        String st = scan.next();

        int r = s.maxPower(st);

        System.out.print(r);
    }

}
