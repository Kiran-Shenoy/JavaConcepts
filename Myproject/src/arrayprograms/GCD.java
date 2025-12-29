package arrayprograms;

import java.util.Scanner;

public class GCD {

	static int gcd(int a,int b)
	{
		while(a!=b)
		{
			if(a>b)
			{
				a =a-b;
			}
			else
			{
				b=b-a;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.print(gcd(a,b));
	}

}
