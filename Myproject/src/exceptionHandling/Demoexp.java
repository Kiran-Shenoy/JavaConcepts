package exceptionHandling;
import java.util.Scanner;

class YoungageException extends Exception
{   
	@Override
	public String getMessage()
	{
		return "YoungageException You are too young bro.";
	}
}
class OlderException extends Exception
{   
	@Override
	public String getMessage()
	{
		return "OlderException You are too old";
	}
}


class Applicant
{
	private int age;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age:");
		age=sc.nextInt();
	}
	public void verify() throws YoungageException,OlderException
	{
		if(age>=18 && age<=65)
		{
			System.out.println("Collect the licence.");
		}
		else if(age<18)
		{
			YoungageException yae= new 	YoungageException();
			System.out.println(yae.getMessage());
			throw yae;
		}
		else
		{
			OlderException oe=new OlderException();
			System.out.println(oe.getMessage());
			throw oe;
		}
    }
}

class RTO
{

	public void operate()
	{
		Applicant a=new Applicant();
		try
		{
			a.input();
			a.verify();
        }
		catch(Exception e)
		{
			System.out.println("1 attempt/s is over");
			try
			{
				a.input();
				a.verify();

			}
			catch(Exception e1)
			{
				System.out.println("2 attempt/s is over");
				try
				{
					a.input();
					a.verify();

				}
				catch(Exception e2)
				{
					System.out.println("3 attempt/s is over");
					System.out.println("Attempts exceeded");
					System.exit(0);
				}			
			}
		}

	}
}

public class Demoexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RTO rto=new RTO();
		rto.operate();

	}

}


