package strings;

import java.util.Scanner;

public class Occurences {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);


		String s=scan.next();
		String t=scan.next();
		
		
		int count=0;
		int size=t.length();
		for(int i=0;i<=s.length()-size;i++)
		{
			String res="";
		for(int j=i;j<i+size;j++)
		{
			res=res+s.charAt(j);
		}
		if(res.equals(t))
		{
			count++;
			
		}
		}
		System.out.println(count);
		

	}

}
