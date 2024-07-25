package strings;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
		
		
		String s=scan.nextLine();
		String st[]=s.split(" ");
		String res="";
		for(int i=0;i<st.length-1;i++)
		{
			if(!(st[i].equals(st[i+1])))
			{
				res=res+st[i]+' ';
			}
		}
		res=res+st[st.length-1];
		System.out.println(res);

	}

}
