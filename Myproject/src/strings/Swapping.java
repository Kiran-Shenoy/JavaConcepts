package strings;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();

		String st[]=s.split(" ");
		
		String res="";
		for(int i=0;i<st.length;i=i+2)
		{
			String temp=st[i];
			res=res+st[i+1]+' '+st[i]+' ';
		}
        System.out.println(res);
	}

}
