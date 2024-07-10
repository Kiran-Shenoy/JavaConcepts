package strings;

import java.util.Scanner;

public class RemovingSpace {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);


		String s=scan.nextLine();
		
		int ei=0,si=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				si=i;
				break;
			}
		}
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			{
				ei=i;
				break;
			}
		}
		String t="";
//		for(int i=si;i<=ei;i++)
//		{
//			t=t+s.charAt(i);
//		}
//		System.out.println(t);
//		====================================
		
		
		for(int i=si;i<=ei;i++)
		{
			if(s.charAt(i)!=' ' ||(s.charAt(i)==' ' && s.charAt(i+1)!=' '))
			{
				t=t+s.charAt(i);
			}
		}
		System.out.println(t);
		
	
	}

}
