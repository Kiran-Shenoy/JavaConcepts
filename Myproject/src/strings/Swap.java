package strings;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();

		String st[]=s.split(" ");
		
		String res="";
		int i=0,j=st.length-1;
		while(i<j)
		{
			res=res+st[i]+st[j]+' ';
			i++;
			j--;
			
		}
		System.out.println(res);

	}

}
