package arrayprograms;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		  
		  
		  int n=scan.nextInt();
		  int a[]=new int[n];
		  for(int i=0;i<a.length;i++)
		  {
			  a[i]=scan.nextInt();
		  }
		  
		  int sum=0;
		  
		  for(int i=0;i<a.length;i++)
		  {
			  sum=sum+a[i];
		  }
		  
		  int avg=sum/n;
		  
		  System.out.println(avg);
		  

	}

}
