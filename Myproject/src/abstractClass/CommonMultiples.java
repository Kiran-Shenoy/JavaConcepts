package abstractClass;

import java.util.Scanner;

public class CommonMultiples {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int a=scan.nextInt();
		int b=scan.nextInt();
		
       for(int i=1;i<=n;i++)
       {
    	   if(i%a==0 && i%b==0)
    	   {
    		   System.out.println(i);
    	   }
       }
	}

}
