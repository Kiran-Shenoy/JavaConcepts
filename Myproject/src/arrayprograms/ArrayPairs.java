package arrayprograms;

import java.util.Scanner;

public class ArrayPairs {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int k=scan.nextInt();
		  int n=scan.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<a.length;i++)
		    {
		    	a[i]=scan.nextInt();
		    }

		    
		    for(int i=0;i<a.length-1;i++)
		    {
		    	for(int j=i+1;j<a.length;j++)
		    	{
		    		if(a[i]-a[j]==k || a[j]-a[i]==k)
		    		{
		    		System.out.println(a[i]+" "+a[j]);
		    	}
		    	}
		    }
	}

}
