package exceptionHandling;

import java.util.Scanner;

public class DemoException {

	public static void main(String[] args) {
		System.out.println("Connection is established.");
		Scanner scan=new Scanner(System.in);
		
		try
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("enter non-zero denominator.");
		}
		
		System.out.println("Connection is Terminated");
		

	}

}
