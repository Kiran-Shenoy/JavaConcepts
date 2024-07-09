package arrayprograms;

import java.util.Scanner;

public class Consecutive {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 int n=scan.nextInt();
		    int a1[]=new int[n];
		    for(int i=0;i<a1.length;i++)
		    {
		    	a1[i]=scan.nextInt();
		    }
		    
//		    for(int i=0;i<a1.length-1;i++)
//		    {
//		    	if(a1[i+1]-a1[i]==1)
//		    	{
//		    		System.out.print(a1[i]+" ");
//		    	}
//		    	else
//		    	{
//		    		System.out.println(a1[i]+" ");
//		    	}
//		    	
//		    }
//		   
//		    System.out.println(a1[a1.length-1]);
		    
//		---------------------------------------------------    
//		    int count=1;
//		    for(int i=0;i<a1.length-1;i++)
//			    {
//			    	if(a1[i+1]-a1[i]==1)
//			    	{
//			    	    count++;
//			    	}
//			    	else
//			    	{
//			    		System.out.println(count);
//			    		count=1;
//			    		
//			    	}
//			    }
//		    System.out.println(count);
		    
		    
//		------------------------------------------------------     
//		    int count=1;
//		    int max=0;
//		    for(int i=0;i<a1.length-1;i++)
//			    {
//			    	if(a1[i+1]-a1[i]==1)
//			    	{
//			    	    count++;
//			    	}
//			    	else 
//			    		{
//			    		if(count>max)
//			    	{
//			    		max=count;
//			    	}
//			    	
//			    		count=1;
//			    		
//			    	}
//			    }
//	          if(count>max)
//            	{
//	          	max=count;
//         	}
//	          System.out.print(max);
	          
//	       =======================================================
		    
		    int count=1;
		    int max=0;
		    int ei=0;
		    for(int i=0;i<a1.length-1;i++)
			    {
			    	if(a1[i+1]-a1[i]==1)
			    	{
			    	    count++;
			    	}
			    	else 
			    		{
			    		if(count>max)
			    	{
			    		max=count;
			    		ei=i;
			    	}
			    	
			    		count=1;
			    		
			    	}
			    }
	          if(count>max)
            	{
	          	max=count;
	          	ei=a1.length-1;
         	}
	          
	          
	          int si=ei-max+1;
	         for(int j=si;j<=ei;j++)
	         {
	        	 System.out.print(a1[j]+" ");
	         }

	}

}
