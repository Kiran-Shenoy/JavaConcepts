package strings;

import java.util.Scanner;

public class Rearrage {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        String s=scan.next();
		
        String st[]=s.split(" ");
    
        
        String temp="";
        for(int i=0;i<st.length;i++)
        {
        	String  res=st[i];
        	String rev=reverse(res);
        	temp=temp+rev+' ';
        }
        System.out.println(temp);
	
        
	}
        
        
        private static String reverse(String res)
        {
        	String t="";
        	for(int i=res.length()-1;i>=0;i--)
        	{
        		t=t+res.charAt(i);
        	}
        
         return t;
}
	

}
