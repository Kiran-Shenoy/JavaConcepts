package strings;

import java.util.Scanner;

public class Rearrange2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();

		String st[]=s.split(" ");


		String temp="";
		for(int i=st.length-1;i>=0;i--)
		{
			String  res=st[i];
			temp=temp+res+' ';
		}
		System.out.println(temp);

	}

}
