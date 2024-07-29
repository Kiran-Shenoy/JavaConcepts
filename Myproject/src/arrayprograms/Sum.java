package arrayprograms;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		
		int sum=0;
		int sum1=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				sum=sum+ar[i];
			}
			else
			{
				sum1=sum1+ar[i];
			}
		}
		int res=sum-sum1;
		System.out.println(res);
	}

}
