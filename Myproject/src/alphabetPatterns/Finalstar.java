package alphabetPatterns;
import java.util.Scanner;
public class Finalstar {
      public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      
      for(int i =1;i<=n;i++) {
    	  System.out.print(" ");
    	  for(int j=1;j<=n;j++) {
    		  if(i==1 || i==n || j==1 || j==n || i==j || i==n/2 || j==n/2 || i+j==n+1 ||
    				  i+j== n/2 + 1 || j-i==n/2 || i-j==n/2  || i+j==n+n/2+1) {
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
