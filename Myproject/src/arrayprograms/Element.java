package arrayprograms;
import java.util.Scanner;

public class Element {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter elements:");
		
	    int n=scan.nextInt();
	    int ar[]=new int[n];
	    for(int i=0;i<ar.length;i++)
	    {
	    	ar[i]=scan.nextInt();
	    }
	    
	    
	    int count =1;
	    for(int i=0;i<ar.length-1;i++)
	    {
	    	
	    		if(ar[i]==ar[i+1])
	    		{
	    			count++;
	    		}
	    		else
	    		{
	    			System.out.println(ar[i]+"-"+count);
	    			count=1;
	    		}
	    	}
	    
	    	System.out.println(ar[ar.length-1]+"-"+count);
	    }
	}

