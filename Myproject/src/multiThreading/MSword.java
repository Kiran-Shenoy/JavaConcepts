package multiThreading;

class Document extends Thread
{
	public void run()
	{
		if(Thread.currentThread().getName().equals("TYPE"))
		{
			type();
		}
		else if(Thread.currentThread().getName().equals("SPELLCHECK"))
		{
			spellcheck();
		}
		else
		{
			autosave();
		}
	}
	
	public void type()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
			System.out.println("typing..");
			Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void spellcheck()
	{
		try
		{
			for(;;)
			{
			System.out.println("checking..");
			Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void autosave()
	{
		try
		{
			for(;;)
			{
			System.out.println("saved..");
			Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}

public class MSword {

	public static void main(String[] args) {
		
		
		Document d1=new Document();
		Document d2=new Document();
		Document d3=new Document();
		
		d2.setDaemon(true);
		d3.setDaemon(true);
		
		d1.setName("TYPE");
		d2.setName("SPELLCHECK");
		d3.setName("AUTOSAVE");
		
		d1.setPriority(1);
		d2.setPriority(5);
		d3.setPriority(10);
		
		d1.start();
		d2.start();
		d3.start();
		
		

	}

}
