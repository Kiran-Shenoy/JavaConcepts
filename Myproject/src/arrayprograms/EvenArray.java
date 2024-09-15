package arrayprograms;

import java.util.Scanner;

public class EvenArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		int n=scan.nextInt();
		
		int a1[]=new int[n];
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=scan.nextInt();
			
		}
		
		
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]%2==0)
			{
				System.out.print(a1[i]+" ");
			}
		}

	}

}
