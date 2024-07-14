package strings;

import java.util.Scanner;

public class SecondString {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);


		String s=scan.next();
		String t=scan.next();
		
		
		int size=t.length();
		int count=0;
		
		for(int i=0;i<=s.length()-size;i++)
		{
			String temp="";
			for(int j=i;j<i+size;j++)
			{
				temp=temp+s.charAt(j);
			}
			if(temp.equals(t))
			{
				count++;
			}
		}
		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


//		String res=second(s,t);
//		System.out.println(res);
//
//
//	}
//	private static String second(String s,String t)
//
//	{
//
//		int size=t.length();
//
//		for(int i=0;i<=s.length()-size;i++)
//		{
//			String temp="";
//			for(int j=i;j<i+size;j++)
//			{
//				temp=temp+s.charAt(j);
//			}
//			if(temp.equals(t))
//			{
//				return "Yes";   
//			}
//		}
//		return "No";
	}

}
