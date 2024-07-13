package strings;

import java.util.Scanner;

public class Length4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);


		String s=scan.next();
		int size=scan.nextInt();
		
		for(int i=0;i<=s.length()-size;i++)
		{
		  String res="";
		  for(int j=i;j<i+size;j++)
		  {
			  res=res+s.charAt(j);
		  }
		  System.out.println(res);
		}

	}

}
