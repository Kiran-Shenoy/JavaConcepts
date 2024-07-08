package exceptionHandling;

import java.util.Scanner;

class Mycalci
{
	
	
	void fun2() throws ArithmeticException
	{
		
		System.out.println("Connection 2 is established.");
		
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
			System.out.println("Handled inside fun().");
			throw e;
		}
		
		finally
		{
			System.out.println("Connection 2 is Terminated");
		}
		
	}
}

public class Rethrow {

	public static void main(String[] args) {
		System.out.println("Connection 1 is established");
		try
		{
			Mycalci mc=new Mycalci();
			mc.fun2();
		}
		catch(Exception e)
		{
			System.out.println("Handled inside main.");
		}
		
		System.out.println("Connection 1 is terminated.");
	}

}
