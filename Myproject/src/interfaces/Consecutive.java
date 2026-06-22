package interfaces;
import java.util.*;
public class Consecutive {
	 public String resultingString(String s) {
	        
	        Stack<Character> stack = new Stack<>();
	        for(char ch : s.toCharArray())
	        {
	            if(!stack.isEmpty() && isConsecutive(stack.peek(), ch))
	            {
	                stack.pop();
	            }
	            else
	            {
	                stack.push(ch);
	            }
	        }
	        StringBuilder sb = new StringBuilder();
	        for(char ch : stack)
	        {
	            sb.append(ch);
	        }

	        return sb.toString();
	    }

	    private boolean isConsecutive(char a, char b)
	    {
	        int diff = Math.abs(a-b);
	        return diff == 1 || diff == 25;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Consecutive s = new Consecutive();

	        String st = scan.next();
	        String r = s.resultingString(st);

	        System.out.print(r);
	    }

}
