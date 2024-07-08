package arrayprograms;

import java.util.Scanner;

public class MergeArrays {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 int n=scan.nextInt();
		    int a1[]=new int[n];
		    for(int i=0;i<a1.length;i++)
		    {
		    	a1[i]=scan.nextInt();
		    }
		    int m=scan.nextInt();
		    int a2[]=new int[m];
		    for(int i=0;i<a2.length;i++)
		    {
		    	a2[i]=scan.nextInt();
		    }
		    
		    int i=0,j=0,k=0;
		    int res[]=new int[a1.length+a2.length]; 
		    while(i<a1.length && j<a2.length)
		    {
		    	if(a1[i]<=a2[j])
		    	{
		    		res[k]=a1[i];
		    		k++;
		    		i++;
		    	}
		    	else
		    	{
		    		res[k]=a2[j];
		    		k++;
		    		j++;
		    	}
		    }
		    while(i<a1.length)
		    {
		    	res[k]=a1[i];
	    		k++;
	    		i++;	
		    }
		    while(j<a2.length)
		    {
		    	res[k]=a2[j];
	    		k++;
	    		j++;	
		    }
		    
		    for(int l=0;l<res.length;l++)
		    {
		    	System.out.println(res[l]);
		    }

	}

}
