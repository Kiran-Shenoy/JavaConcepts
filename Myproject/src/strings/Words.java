package strings;

import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);


		String s=scan.nextLine();
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				count++;
				
			}
		}
		if(s.charAt(0)==' ')
		{		
		System.out.println(count);
		}
		else
		{
			System.out.println(count+1);
		}

	}

}
