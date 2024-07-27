package arrayprograms;

import java.util.Scanner;

public class Missing {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []ar=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
			
		}
		int count=0;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i+1]-ar[i]==1)
			{
				count++;
			}
			else
			{
				System.out.print(ar[i]+1);
			}
		}

	}

}
