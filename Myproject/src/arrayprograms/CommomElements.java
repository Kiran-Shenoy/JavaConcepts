package arrayprograms;

import java.util.Scanner;

public class CommomElements {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n1=scan.nextInt();
		int a1[]=new int[n1];
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=scan.nextInt();
		}
		
		int n2=scan.nextInt();
		int a2[]=new int[n2];
		for(int j=0;j<a2.length;j++)
		{
			a2[j]=scan.nextInt();
		}
		
		
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					System.out.print(a1[i]+" ");
				}
			}
		}
	}

}
