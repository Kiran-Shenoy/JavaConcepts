package encapsulation;
import java.util.*;
public class SubString {

	 public int minLength(String s) {
	        
	        Stack<Character> stack = new Stack<>();

	        for(char ch : s.toCharArray())
	        {
	            if(ch == 'B' && !stack.isEmpty() && stack.peek() == 'A')
	            {
	                 stack.pop();
	            }
	            else if(ch == 'D' && !stack.isEmpty() && stack.peek() == 'C')
	            {
	                 stack.pop();
	            }
	            else
	            {
	                stack.push(ch);
	            }
	        }
	        return stack.size();

	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        SubString s = new SubString();

	        String st = scan.next();

	        int r = s.minLength(st);

	        System.out.print(r);
	    }
}
