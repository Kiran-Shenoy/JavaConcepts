package staticConcept;

import java.util.Scanner;

public class CheckDevisor {

	static void checkdivide(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
      

int n = scan.nextInt();

checkdivide(n);

}
}
