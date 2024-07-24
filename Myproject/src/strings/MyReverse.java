package strings;

import java.util.Scanner;

public class MyReverse {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		
		String s=scan.nextLine();
		String st[]=s.split(" ");
		String res="";
		int i=0,j=st.length-1;
		while(i<j)
		{
			String rev=reverse(st[j]);
			res=res+rev+st[i]+' ';
			i++;
			j--;
		}
		System.out.println(res);
	}
		
		 private static String reverse(String st)
			{
				String t="";
				for(int i=st.length()-1;i>=0;i--)
				{
					t=t+st.charAt(i);
				}

				return t;
	}

}
