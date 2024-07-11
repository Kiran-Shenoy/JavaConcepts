package strings;

import java.util.Scanner;

public class converting {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);


		String s=scan.nextLine();
		String t="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
				t=t+'*'+s.charAt(i);
			}
			else
			{
				t=t+s.charAt(i);
			}
		}
		System.out.println(t);
	}

}
