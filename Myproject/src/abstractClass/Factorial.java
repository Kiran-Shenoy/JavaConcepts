package abstractClass;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
	 int res=factorial(n);
	 System.out.println(res);
	 
	}
	
	private static int factorial(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
	    }
		else
		{
			return n*factorial(n-1);
		}
		

	}

}
