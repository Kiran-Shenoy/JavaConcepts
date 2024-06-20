package multiThreading;


class Printing implements Runnable
{
	synchronized public void run()
	{
		String name=Thread.currentThread().getName();

		try
		{
			System.out.println(name+" started printing..");
			Thread.sleep(2000);
			for(int i=1;i<=5;i++)
			{
				System.out.println(name+" is printing.");
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(name+" completed printing..");

	}
}

public class Printer {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Started");

		Printing p=new Printing();

		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		Thread t3=new Thread(p);

		t1.setName("MAN");
		t2.setName("WOMAN");
		t3.setName("CHILD");

		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Main ended");

	}

}
