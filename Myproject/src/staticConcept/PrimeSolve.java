package staticConcept;

import java.util.Scanner;

public class PrimeSolve {

	public static boolean checkPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
      

int n = scan.nextInt();

System.out.print(checkPrime(n));

	}

}
