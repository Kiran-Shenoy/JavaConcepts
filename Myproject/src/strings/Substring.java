package strings;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);


		String s=scan.next();
		String t=scan.next();
		
		int i=0,j=0;
		
		while(i<s.length() && j<t.length())
		{
			if(s.charAt(i)==t.charAt(j))
			{
				i++;
				j++;
				
			}
			else
			{
				i++;
			}
		}
		if(j==t.length())
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
