package arrayprograms;

import java.util.Scanner;

public class Merge3Arrays {

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
		    for(int j=0;j<a2.length;j++)
		    {
		    	a2[j]=scan.nextInt();
		    }
		    int o=scan.nextInt();
		    int a3[]=new int[o];
		    for(int x=0;x<a3.length;x++)
		    {
		    	a3[x]=scan.nextInt();
		    }
		    
		    int i=0,k=0;
		    int res[]=new int[a1.length+a2.length+a3.length]; 
		    while(k<res.length)
		    {
		      if(i<a1.length)
		      {
		    	  res[k]=a1[i];
		    	  k++;
		      }
		      if(i<a2.length)
		      {
		    	  res[k]=a2[i];
		    	  k++;
		      }
		      if(i<a3.length)
		      {
		    	  res[k]=a3[i];
		    	  k++;
		      }
		      i++;
		    }
		    for(int j=0;j<res.length;j++)
		    {
		    	System.out.print(res[j]+" ");
		    }

	}

}
