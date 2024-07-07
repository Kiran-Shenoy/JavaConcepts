package arrayprograms;

import java.util.Scanner;

public class smallestRepeat {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		  int n=scan.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<a.length;i++)
		    {
		    	a[i]=scan.nextInt();
		    }
		    
		    int res=largestrepeat(a);
		    System.out.println(res);
//		    int count=1;
//		    for(int i=0;i<a.length-1;i++)
//		    {
//		    	if(a[i]==a[i+1])
//		    	{
//		    		count++;
//		    	}
//		    	else if(count>1)
//		    	{
//		    		System.out.println(a[i]);
//		    		break;
//		    	}
//		    }
		    
		   

	}

	private static int largestrepeat(int[] a) {
		 int count=1;
		    for(int i=a.length-2;i>=0;i--)
		    {
		    	if(a[i]==a[i+1])
		    	{
		    		return a[i];
		    	}
		    }
		return -1;
	}

}
