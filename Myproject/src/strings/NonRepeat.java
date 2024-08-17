package strings;

import java.util.Scanner;

public class NonRepeat {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String s=scan.next();
		
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
			    {
					count++;
				}
				else if(count==1)
				{
					System.out.println(s.charAt(j));
					break;
				}
			}
		}

	}

}
