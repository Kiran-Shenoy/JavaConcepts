package inheritance;
import java.util.*;
public class LeftRight {

	public String pushDominoes(String dominoes) {
        char[] arr = dominoes.toCharArray();
        int n = arr.length;
        int[] forces = new int[n];

        int force = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 'R') force=n;
            else if(arr[i] == 'L') force =0;
            else force = Math.max(force - 1, 0);
            forces[i] += force;
        }

        for(int i = n-1;i>=0;i--)
        {
            if(arr[i] == 'L') force = n;
            else if(arr[i] == 'R') force = 0;
            else force =Math.max(force -1,0);
            forces[i] -= force;
        }

        StringBuilder sb = new StringBuilder();
        for(int f : forces)
        {
            if(f > 0) sb.append("R");
            else if(f < 0 ) sb.append("L");
            else sb.append(".");
        }
return sb.toString();
    }
    public static void main(String[] args)
    {
        Scanner scan  = new Scanner(System.in);
        LeftRight s = new LeftRight();

        String st = scan.next();

        String r = s.pushDominoes(st);
        
        System.out.print(r);
    }

}
