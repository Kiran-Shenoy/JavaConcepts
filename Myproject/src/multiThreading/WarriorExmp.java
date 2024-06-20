package multiThreading;

class Resource extends Thread
{
	String res1="Sarpasthra";
	String res2="Brahmasthra";
	String res3="Pashupathasthra";
	
	synchronized public void run()
	{
		if(Thread.currentThread().getName().equals("RAMA"))
		{
			ramaAccRes();
		}
		else
		{
			ravanaAccRes();
		}
		
		
	}
	public void ramaAccRes()
	{
		synchronized(res1)
		{
			try
			{
				
				System.out.println("Rama accquired "+res1);
				Thread.sleep(2000);
				synchronized(res2)
				{
					System.out.println("Rama accquired "+res2);
					Thread.sleep(2000);
					synchronized(res3)
					{
						System.out.println("Rama accquired "+res3);
						Thread.sleep(2000);
					}
					
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
	}

	public void ravanaAccRes()
	{
		synchronized(res1)
		{
			try
			{
				System.out.println("Ravana accquired "+res1);
				Thread.sleep(2000);
				synchronized(res2)
				{
					System.out.println("Ravana accquired "+res2);
					Thread.sleep(2000);
					synchronized(res3)
					{
						System.out.println("Ravana accquired "+res3);
						Thread.sleep(2000);
					}
					
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}
}

public class WarriorExmp {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main started.");
		
		Resource r1=new Resource();
		Resource r2=new Resource();
		
		r1.setName("RAMA");
		r2.setName("RAVANA");
		
		r1.start();
		r2.start();
		
		r1.join();
		r2.join();
		
		System.out.println("Main ended.");
		
		

	}

}
