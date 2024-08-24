package strings;

import java.util.Scanner;

public class UniqueChar {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		String str1=scan.next();
		
		
		boolean res= hasUnique(str1);
		System.out.println(res);
		
	}
	
	
	public  static boolean hasUnique(String str)
	{
		int len=str.length();
		
		for(int i=0;i<len-1;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(str.charAt(i)== str.charAt(j))
				{
					return false;
				}
			}
		}
		return true;
	}

}
