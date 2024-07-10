package strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);


		String s=scan.next();

		String res=reverse(s);
		if(s.equals(res))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

	public static String reverse(String s)
	{
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				i++;
				j--;

			}
			else
			{
				return "Not Palindrome";
			}
		}
		return "Palindrome";


	}

}
