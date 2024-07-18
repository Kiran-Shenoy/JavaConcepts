package strings;

import java.util.Scanner;

public class Rearrange1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();

		String st[]=s.split(" ");


		String temp="";
		for(int i=0;i<st.length;i++)
		{
			String  res=st[i];
			String rev=reverse(res);
			if(i==0 || i==st.length-1)
			{
			temp=temp+rev+' ';
	     	}
			else
			{
			temp=temp+res+' ';
			}
		}
		System.out.println(temp);

	}
   private static String reverse(String res)
	{
		String t="";
		for(int i=res.length()-1;i>=0;i--)
		{
			t=t+res.charAt(i);
		}

		return t;
	

	}

}
