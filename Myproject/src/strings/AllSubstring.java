package strings;

import java.util.Scanner;

public class AllSubstring {

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
				System.out.println(res);
			}
		}

	}

}
