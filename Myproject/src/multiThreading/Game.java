package multiThreading;

class Family implements Runnable
{
    String res1="Playstation";
    String res2="Joystick";
	public void run() 
	{
		if(Thread.currentThread().getName().equals("ROHIT"))
		{
			rohitAccRes();
		}
		else
		{
			vijayAccRes();
		}
		
		
	}
	public void vijayAccRes()
	{
		synchronized(res1)
		{
			try
			{
				System.out.println("Vijay accquired "+res1);
				Thread.sleep(2000);
				synchronized(res2)
				{
					System.out.println("Vijay accquired "+res2);
					Thread.sleep(2000);
					
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	public void rohitAccRes()
	{
		synchronized(res1)
		{
			try
			{
				System.out.println("Rohit accquired "+res1);
				Thread.sleep(2000);
				synchronized(res2)
				{
					System.out.println("Rohit accquired "+res2);
					Thread.sleep(2000);
					
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
}

public class Game {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main started");
		
		Family f=new Family();
		
		Thread th1=new Thread(f);
		Thread th2=new Thread(f);
		
		th1.setName("ROHIT");
		th2.setName("VIJAY");
		
		th1.start();
		th2.start();
		
		th1.join();
		th2.join();
		
		System.out.println("Main ended");
	}

}
