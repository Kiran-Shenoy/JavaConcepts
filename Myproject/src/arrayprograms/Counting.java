package arrayprograms;

import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 int n=scan.nextInt();
		    int a1[]=new int[n];
		    for(int i=0;i<a1.length;i++)
		    {
		    	a1[i]=scan.nextInt();
		    }
		    int size=scan.nextInt();
		    int k=scan.nextInt();
//		    int count=0;
//		    
//		    for(int i=0;i<=a1.length-size;i++)
//		    {
//		    	int sum=0;
//		    	for(int j=i;j<i+size;j++)
//		    	{
//		    		sum=sum+a1[j];
//		    	}
//		    	if(sum==k)
//		    	{
//		    		count++;
//		    	}
//		    }
//		    System.out.println(count);
//		    	

		    
		    for(int i=0;i<=a1.length-size;i++)
			    {
			    	int sum=0;
			    	for(int j=i;j<i+size;j++)
			    	{
			    		sum=sum+a1[j];
			    	}
			    	if(sum==k)
			    	{
			    		for(int j=i;j<i+size;j++ )
			    		{
			    			System.out.print(a1[j]+" ");
			    		}
			    	}
			    	System.out.println();
		    
		  }	    
	}

}
