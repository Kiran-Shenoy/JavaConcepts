package arrayprograms;

import java.util.Scanner;

public class Shifting {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 int n=scan.nextInt();
		    int a1[]=new int[n];
		    for(int i=0;i<a1.length;i++)
		    {
		    	a1[i]=scan.nextInt();
		    }
		    
//		    int i=a1.length-1,j=a1.length-1;
//		    while(i>=0)
//		    {
//		    	if(a1[i]==-1)
//		    	{
//		    		i--;
//		    	}
//		    	else
//		    	{
//		    		a1[j]=a1[i];
//		    		j--;
//		    		i--;
//		    	}
//		    }
//		    while(j>=0)
//		    {
//		    	a1[j]=-1;
//		    	j--;
//		    }
//		    
//		    for(int k=0;k<a1.length;k++)
//		    {
//		    	System.out.print(a1[k]+" ");
//		    }
		    
		    
		    
		    
		    int i=0,j=0;
		    while(i<a1.length)
		    {
		    	if(a1[i]==0)
		    	{
		    		i++;
		    	}
		    	else
		    	{
		    		a1[j]=a1[i];
		    		j++;
		    		i++;
		    	}
		    }
		    while(j<a1.length)
		    {
		    	a1[j]=0;
		    	j++;
		    }
		    for(int k=0;k<a1.length;k++)
			    {
			    	System.out.print(a1[k]+" ");
			    }

	}

}
