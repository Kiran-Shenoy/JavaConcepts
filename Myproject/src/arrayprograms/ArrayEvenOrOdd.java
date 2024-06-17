package arrayprograms;
import java.util.Scanner;
public class ArrayEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] a =new int[n];
		
		 for(int i=0;i<=a.length-1;i++)
		   {
		      a[i]=scan.nextInt();
		   }
		EvenIndexElement(a);
		
	}


   public static void EvenIndexElement(int[] a) {
	   for(int i=0;i<=a.length-1;i++)
	   {
		   if(i%2!=0)
		   {
			   System.out.print(a[i]+" ");
		   }
	   }
   }
   
}