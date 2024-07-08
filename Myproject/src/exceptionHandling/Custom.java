package exceptionHandling;

import java.util.Scanner;

class InvalidUserException extends Exception
{
   @Override
   public String getMessage()
   {
	   return "InvalidUserException Invalid card details try again!!";
   }
}

class ATM
{
	private int accNum=1234;
	private int pin=9999;
	private int an;
	private int pwd;
	
	
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the acc num:");
	    int an=scan.nextInt();
	    System.out.println("Enter the pwd:");
	    int pwd=scan.nextInt();
	    
	}
	
	
	
	public void validate() throws InvalidUserException
	{
		if(accNum==an && pin==pwd)
		{
			System.out.println("Collect your money");
		}
		else
		{
			InvalidUserException iue=new InvalidUserException();
			System.out.println(iue.getMessage());
			throw iue;
		}
	}
}


class Bank
{
	public void initiate()
	{
		ATM atm=new ATM();
		try {
			atm.input();
			atm.validate();
		}
		catch(Exception e)
		{
			System.out.println("1 attempt/s is over");
			try {
				atm.input();
				atm.validate();
			}
			catch(Exception f)
			{
				System.out.println("2 attempt/s is over");
				try {
					atm.input();
					atm.validate();
				}
				catch(Exception g)
				{
					System.out.println("3 attempt/s is over");
					System.out.println("Card is blocked!!.");
					System.exit(0);
				}
			}
		}
	}
}
public class Custom {

	public static void main(String[] args) {
		
		Bank bk=new Bank();
		bk.initiate();
		

	}

}
