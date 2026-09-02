package inheritance;
import java.util.*;
public class Clumsyyy {

public int clumsy(int n) {
        
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(n);
        int op = 0;

        for(int i=n-1; i > 0;i--)
        {
            if(op == 0)
            {
                stack.push(stack.pop() * i);
            }
            else if(op == 1)
            {
                stack.push(stack.pop() / i);
            }
            else if(op == 2)
            {
                stack.push(i);
            }
            else if(op == 3)
            {
                stack.push(-i);
            }
            op = (op +1) % 4;
        }

        int res = 0;
        while(!stack.isEmpty())
        {
            res += stack.pop();
        }

        return res;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Clumsyyy s = new Clumsyyy();

        int n = scan.nextInt();

        int r = s.clumsy(n);

        System.out.print(r);
    }

}
