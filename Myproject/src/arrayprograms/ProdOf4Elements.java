package arrayprograms;
import java.util.Scanner;

public class ProdOf4Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
			
			int n = scan.nextInt();
			
			int[] a =new int[n];
			
			 for(int i=0;i<=a.length-1;i++)
			   {
			      a[i]=scan.nextInt();
			   }
			    ProdOfElements(a);
			   
		}
	  public static void ProdOfElements(int[] a) {
		   int prod=1;
		   for(int i=0;i<=a.length-1;i++)
		   {
				   prod=prod*a[i];
			   
		   }
		 
		   
		   int res[]=new int[a.length];
		   
		   for(int i=0;i<=a.length-1;i++)
		   {
			   res[i]= prod/a[i];
		   }
		   for(int i=0;i<=a.length-1;i++)
		   {
			   System.out.print(res[i]+" ");
		   }
	  }
		   
}
