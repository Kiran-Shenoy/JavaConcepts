package arrayprograms;

import java.util.Scanner;

public class TwoArrays {

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
		    
		    int i=0,j=0;
		    while(i<a1.length && j<a2.length)
		    {
		    	if(a1[i]==a2[j])
		    	{
		    		System.out.print(a1[i]+" ");
		    		i++;
		    		j++;
		    	}
		    	else if(a1[i]>a2[j])
		    	{
		    		j++;
		    	}
		    	else
		    	{
		    		i++;
		    	}
		    		
		    }

	}

}
