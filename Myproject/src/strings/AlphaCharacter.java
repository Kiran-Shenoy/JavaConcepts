package strings;

import java.util.Scanner;

public class AlphaCharacter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);


		String s=scan.nextLine();
		String t="";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
			{
				t=t+ch;
			}
			else if(ch>='0' && ch<='9')
			{
				sum=sum+(ch-48);
			}
		}
		String res=t+sum;
		System.out.println(res);
	
	}

}
