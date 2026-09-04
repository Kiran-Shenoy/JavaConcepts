package exceptionHandling;
import java.util.*;
public class Temper {

public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        int[] ans = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0;i<n;i++)
        {
           while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i])
           {
              int prev = stack.pop();
              ans[prev] = i - prev;
           }
           stack.push(i);
        }

        return ans;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Temper s = new Temper();

        int n = scan.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]= scan.nextInt();
        }

        int[] r = s.dailyTemperatures(ar);

        for(int k=0;k<r.length;k++)
        {
            System.out.print(r[k]+" ");
        }
    }
}
