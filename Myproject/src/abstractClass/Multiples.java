package abstractClass;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int x=scan.nextInt();
		
		for(int i=1;i<=x;i++)
		{
			if(i%n==0)
			{
				System.out.println(i);
			}
		}

	}

}
