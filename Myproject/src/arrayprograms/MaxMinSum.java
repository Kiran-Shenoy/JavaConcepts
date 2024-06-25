package arrayprograms;
import java.util.Scanner;

public class MaxMinSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scan=new Scanner(System.in);
			
			int n = scan.nextInt();
			
			int[] a =new int[n];
			
			 for(int i=0;i<=a.length-1;i++)
			   {
			      a[i]=scan.nextInt();
			   }
			   int sum=  SumOfElements(a);
		       int max =MaxElement(a);
			   int min=  MinElement(a);
			   
			   System.out.println(sum);
			   System.out.println(max);
			   System.out.println(min);
			   
			   System.out.println(sum-max);
			   System.out.println(sum-min);
		}
	
	   public static int  MaxElement(int[] a) {
		int max=Integer.MIN_VALUE;
	
	   for(int i=0;i<=a.length-1;i++)
	   {
		   if(a[i]>max) {
			   max=a[i];   
		   }
	   }
	  return max;	  
		   
	   }
	
	public static int  MinElement(int[] a) {
		int min=Integer.MAX_VALUE;
	
	   for(int i=0;i<=a.length-1;i++)
	   {
		   if(a[i]<min) {
			   min=a[i];   
		   }
	   }
	  return min;	  
		   
	}
	   
     public static int  SumOfElements(int[] a) {
		   int sum=0;
		   for(int i=0;i<=a.length-1;i++)
		   {
				   sum=sum+a[i];
			   
		   }
		   return sum;

	}
	   

}
