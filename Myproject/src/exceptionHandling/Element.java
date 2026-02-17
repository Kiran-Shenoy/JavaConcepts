package exceptionHandling;
import java.util.Scanner;
public class Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     
     int n = scan.nextInt();
     int[] a = new int[n];
     for(int i=0;i<n;i++)
     {
    	 a[i] = scan.nextInt();
     }
     
     int max = Integer.MIN_VALUE;
     for(int num : a)
     {
    	 if(num > max)
    	 {
    		 max = num;
    	 }
     }
     
     System.out.print(max);
	}

}
