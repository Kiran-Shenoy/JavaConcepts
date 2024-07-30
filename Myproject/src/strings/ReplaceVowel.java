package strings;

import java.util.Scanner;

public class ReplaceVowel {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		String s=scan.next();
		String res="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				res=res+'z';
			}
			else
			{
				res=res+ch;
			}
		}
		System.out.println(res);

	}

}
