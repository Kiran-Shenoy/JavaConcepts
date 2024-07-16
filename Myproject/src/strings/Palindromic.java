package strings;

import java.util.Scanner;

public class Palindromic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);


		String s=scan.next();
		
		for(int size=1;size<=s.length();size++)
		{
			for(int i=0;i<=s.length()-size;i++)
			{
				String res="";
				for(int j=i;j<i+size;j++)
				{
					res=res+s.charAt(j);
				}
				if(Palindromic(res))
				{
					System.out.println(res);
				}
			}
		}

	}
	
	private static boolean Palindromic(String res)
	{
		int i=0;
		int j=res.length()-1;
		while(i<j)
		{
			if(res.charAt(i)==res.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				return false;
			}
		}
		return true;
		
		
		
	}

}
