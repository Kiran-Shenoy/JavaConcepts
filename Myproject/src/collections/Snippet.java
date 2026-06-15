package collections;

public class Snippet {
	   public String removeStars(String s) {
	        Stack<Character> stack = new Stack<>();
	
	        for(char ch : s.toCharArray())
	        {
	            if(ch == '*')
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
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Solution s = new Solution();
	
	        String st = scan.next();
	
	        String r = s.removeStars(st);
	
	        System.out.print(r);
	    }
}

