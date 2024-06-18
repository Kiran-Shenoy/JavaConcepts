package multiThreading;

import java.util.Scanner;

class Demo5 extends Thread
{
	public void run()
	{
		System.out.print(Thread.currentThread());
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

	public static void main(String[] args) {
		
		Demo5 d5=new Demo5();
		
		Thread th1=new Thread(d5);
		Thread th2=new Thread(d5);
		Thread th3=new Thread(d5);
//		
//		th1.getName();
//		th2.getName();
//		th3.getName();
//		
		th1.start();
		th2.start();
		th3.start();
		
		

	}

}
