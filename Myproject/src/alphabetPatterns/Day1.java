package alphabetPatterns;
import java.util.Scanner;

public class Day1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		 for(int i =1;i<=n;i++) {
	    	  System.out.print(" ");
	    	  for(int j=1;j<=n;j++) {
	    		  if(i==n/4 || i==((3*n)/4)|| j==n/4 || j==(3*n)/4 || i==1 &&(j<=n/4 || j>=(3*n)/4) || 
	    				  i==n &&(j<=n/4 || j>=(3*n)/4)  ||
	    		  j==n && (i<=n/4 || i>=(3*n)/4) ||
	    		  j==1&& (i<=n/4 || i>=(3*n)/4) || i==j && (j>=n/4 && j<=(3*n)/4) ){
	    				  System.out.print("*");
    		  }
    		  else {
    			  System.out.print(" ");
    		  }
    	  }
    	  System.out.println();
      }
      
     
      }

}
