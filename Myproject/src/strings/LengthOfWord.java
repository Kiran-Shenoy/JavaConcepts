package strings;

import java.util.Scanner;

public class LengthOfWord {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();

		String st[]=s.split(" ");
		
		String res="";
		for(int i=0;i<st.length;i++)
		{
			String temp=st[i];
			int len=temp.length();
			res=res+temp+len+' ';
		}
		System.out.println(res);

	}

}
