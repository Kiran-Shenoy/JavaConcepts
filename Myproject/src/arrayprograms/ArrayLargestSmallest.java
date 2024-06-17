package arrayprograms;
import java.util.Scanner;

public class ArrayLargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		   Scanner scan=new Scanner(System.in);
//			
//			int n = scan.nextInt();
//			
//			int[] a =new int[n];
//			
//			 for(int i=0;i<=a.length-1;i++)
//			   {
//			      a[i]=scan.nextInt();
//			   }
//			LargestElement(a);
//			
//		}
//
//
//	   public static void LargestElement(int[] a) {
//		   int max=Integer.MIN_VALUE;
//		   for(int i=0;i<=a.length-1;i++)
//		   {
//			   if(a[i]>max)
//			   {
//				   max=a[i];
//			   }
//		   }
//		   System.out.print(max);
		
		  
//		
//		  Scanner scan=new Scanner(System.in);
//			
//			int n = scan.nextInt();
//			
//			int[] a =new int[n];
//			
//			 for(int i=0;i<=a.length-1;i++)
//			   {
//			      a[i]=scan.nextInt();
//			   }
//			SmallestElement(a);
//			
//		}
//
//
//	   public static void SmallestElement(int[] a) {
//		   int min=Integer.MAX_VALUE;
//		   for(int i=0;i<=a.length-1;i++)
//		   {
//			   if(a[i]<min)
//			   {
//				   min=a[i];
//			   }
//		   }
//		   System.out.print(min);
//		
		
			
			  Scanner scan=new Scanner(System.in);
				
				int n = scan.nextInt();
				
				int[] a =new int[n];
				
				 for(int i=0;i<=a.length-1;i++)
				   {
				      a[i]=scan.nextInt();
				   }
				SmallestElement(a);
				
			}


		   public static void SmallestElement(int[] a) {
			   int max=Integer.MIN_VALUE;
			   int index=0;
			   for(int i=0;i<=a.length-1;i++)
			   {
				   if(a[i]>max)
				   {
					   max=a[i];
					   index=i;
				   }
			   }
			   System.out.print(index);
			
			

	}

}
