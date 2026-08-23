package inheritance;
import java.util.*;
public class ClearLetter {

	public String clearDigits(String s) {
	    
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray())      
        {
            if(Character.isDigit(ch))
            {
               stack.pop();
            }
            else
            {
               stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c : stack)
        {
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ClearLetter s = new ClearLetter();

        String st = scan.next();

        String r = s.clearDigits(st);

        System.out.print(r);
    }
}
