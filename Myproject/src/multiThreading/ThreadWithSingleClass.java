package multiThreading;

import java.util.Scanner;

class Demo5 extends Thread
{
	public void run()
	{
		if(Thread.currentThread().getName().equals("ADD"))
		{
			add();
		}
		else if(Thread.currentThread().getName().equals("PRINTA"))
		{
			printA();
		}
		else
		{
			printN();
		}
		
	}
	
	public void add()
	{
		System.out.println("Addition is start");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first number:");
		int a=scan.nextInt();
		System.out.println("enter the second number:");
		int b=scan.nextInt();
		int c=a+b;
		System.out.println(c);
		System.out.println("Addition is ended");
	}
	
	public void printA()
	{
		System.out.println("printing characters is start");
		try
		{

			for(int i=65;i<=75;i++)
			{
				System.out.println((char)i);
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("printing characters is ended");
	}
	public void printN()
	{
		System.out.println("printing numbers is start");
		try
		{

			for(int i=1;i<=10;i++)
			{
				System.out.println(i);
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("printing numbers is ended");
	}
}

public class ThreadWithSingleClass {

	public static void main(String[] args)  {
		
		Demo5 d1=new Demo5();
		Demo5 d2=new Demo5();
		Demo5 d3=new Demo5();
		
		//		
		d1.setName("ADD");
		d2.setName("PRINTA");
		d3.setName("PRINTN");
		
		
		d1.start();
		d2.start();
		d3.start();
		
		

	}

}
