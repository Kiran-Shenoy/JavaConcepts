package multiThreading;

import java.util.Scanner;

class Demo1 extends Thread
{
	public void run()
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
}
class Demo2 extends Thread
{
	public void run()
	{
		System.out.println("printing characters is start");
		try
		{

			for(int i=65;i<=75;i++)
			{
				System.out.println((char)i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("printing characters is ended");
	}
}
class Demo3 extends Thread
{
	public void run()
	{
		System.out.println("printing numbers is start");
		try
		{

			for(int i=1;i<=10;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("printing numbers is ended");
	}
}
public class Test {

	public static void main(String[] args) {
		
		Demo1 d1=new Demo1();
		Demo2 d2=new Demo2();
		Demo3 d3=new Demo3();
		
		d1.start();
		d2.start();
		d3.start();
		
	

	}

}
