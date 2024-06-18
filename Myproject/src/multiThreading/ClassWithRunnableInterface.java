package multiThreading;

import java.util.Scanner;

class Demo6 implements Runnable
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
class Demo7 implements Runnable
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

class Demo8 implements Runnable
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
public class ClassWithRunnableInterface {

	public static void main(String[] args) {
		Demo6 d6=new Demo6();
		Demo7 d7=new Demo7();
		Demo8 d8=new Demo8();
		
		Thread th1=new Thread(d6);
		Thread th2=new Thread(d7);
		Thread th3=new Thread(d8);
		
		
		th1.start();
		th2.start();
		th3.start();
		
		

	}

}
