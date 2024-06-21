package multiThreading;

class Print extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("JAVA");
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread started.");
		Print p=new Print();
		
		p.start();
		p.join();
		System.out.println("Main thread ended.");
		
		

	}

}
