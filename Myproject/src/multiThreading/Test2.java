package multiThreading;

class User extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("User Thread Executing..");
				Thread.sleep(2000);
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}
class Daemon extends Thread
{
	public void run()
	{
		try
		{
			for(;;)
			{
				System.out.println("Daemon Thread Executing..");
				Thread.sleep(2000);
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}



	public class Test2 {

		public static void main(String[] args) {


			User d7=new User();
			Daemon d8=new Daemon();
			
			d8.setDaemon(true);
		

			d7.start();
			d8.start();
			


		}

	}
