package abstractClass;

import java.util.Scanner;

public class Absolute {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		if(n>0)
		{
			System.out.println(n);
		}
		else
		{
			System.out.println(n*-1);
		}

	}

}
