package arrayprograms;
import java.util.Scanner;

public class ArraySumProd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Scanner scan=new Scanner(System.in);
//		
//		int n = scan.nextInt();
//		
//		int[] a =new int[n];
//		
//		 for(int i=0;i<=a.length-1;i++)
//		   {
//		      a[i]=scan.nextInt();
//		   }
//		SumOfElements(a);
//		
//	}
//
//
//   public static void SumOfElements(int[] a) {
//	   int sum=0;
//	   for(int i=0;i<=a.length-1;i++)
//	   {
//		   {
//			   sum=sum+a[i];
//		   }
//	   }
//	   System.out.print(sum);
		
		   Scanner scan=new Scanner(System.in);
			
			int n = scan.nextInt();
			
			int[] a =new int[n];
			
			 for(int i=0;i<=a.length-1;i++)
			   {
			      a[i]=scan.nextInt();
			   }
			SumOfElements(a);
			
		}


	   public static void SumOfElements(int[] a) {
		   int prod=1;
		   for(int i=0;i<=a.length-1;i++)
		   {
				   prod=prod*a[i];
			   
		   }
		   System.out.print(prod);
	   }
	}


