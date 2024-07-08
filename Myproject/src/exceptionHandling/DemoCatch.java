package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoCatch {

	public static void main(String[] args) {
		System.out.println("Connection is established.");
		Scanner scan=new Scanner(System.in);
		
		try
		{
			System.out.println("enter the numerator:");
			int a=scan.nextInt();
			System.out.println("enter the denomenator:");
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
			System.out.println("enter the size of array:");
			int size=scan.nextInt();
			int ar[]=new int[size];
			System.out.println("enter the element:");
			int ele=scan.nextInt();
			System.out.println("enter the index:");
			int index=scan.nextInt();
			ar[index]=ele;
//			ar=null;
			System.out.println(ar[index]);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("enter non-zero denominator.");
		}
		catch(NegativeArraySizeException nae)
		{
			System.out.println("enter +ve array size.");
		}
		catch(InputMismatchException ime)
		{
			System.out.println("enter only integers.");	
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("provide valid index.");	
		}
         catch(Exception e)
		{
        	 System.out.println("Invalid input.TRY AGAIN!!");
		}
		
		System.out.println("Connection is Terminated");
	}

}
