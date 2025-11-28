package arrayprograms;
import java.util.Scanner;
import java.util.List;
import  java.util.ArrayList;
public class StringIndices {

	 public List<Integer> findWordsContaining(String[] words, char x) {
	        List<Integer> list = new ArrayList<>();
	        for(int i=0;i<words.length;i++)
	        {
	           for(int j=0;j<words[i].length();j++)
	           {
	                if(x == words[i].charAt(j))
	                {
	                    list.add(i);
	                    break;
	                }
	           }
	        }
	        return list;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        StringIndices s = new StringIndices();

	        int n = scan.nextInt();
	        String st[] = new String[n];
	        for(int i=0;i<st.length;i++)
	        {
	            st[i]  = scan.next();
	        }
	        char x = scan.next().charAt(0);
	        List<Integer> r  = s.findWordsContaining(st,x);

	        System.out.print(r);
	    }

}
