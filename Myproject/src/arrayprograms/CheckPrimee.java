package arrayprograms;
import java.util.Scanner;
public class CheckPrimee {

	static boolean prime(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
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
   
   int n =scan.nextInt();
   
   System.out.print(prime(n));
	}

}
