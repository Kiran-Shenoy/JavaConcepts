package arrayprograms;

import java.util.Scanner;

public class CopyReverse {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
	
		int res[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			res[i]=a[i];
		}
		
		for(int k=res.length-1;k>=0;k--)
		{
			System.out.println(res[k]);
		}
	}

}
