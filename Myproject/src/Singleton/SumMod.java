package Singleton;

import java.util.Scanner;

public class SumMod {

	
	public static int sum(int n)
	{
		if(n ==0 )
		{
			return 0;
		}
	   return sum(n/10) + (n%10);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int n = scan.nextInt();
		
		System.out.print((n%10));
	}

}
