package strings;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		String s=scan.next();
		
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			 res=res+s.charAt(i);
			
			
		}
		System.out.println(res);
		

	}

}
