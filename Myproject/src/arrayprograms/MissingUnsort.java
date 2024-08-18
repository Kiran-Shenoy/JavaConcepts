package arrayprograms;

import java.util.Scanner;

public class MissingUnsort {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		
		int expectedSum = (n * (n + 1)) / 2;
		
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		
		int res=expectedSum-sum;
		
		System.out.println(res);
	}

}
