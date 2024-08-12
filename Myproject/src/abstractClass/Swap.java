package abstractClass;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		  int n=scan.nextInt();
		  int m=scan.nextInt();
		  
		  int temp=n;
		  n=m;
		  m=temp;
		  
		  System.out.println(n);
		  System.out.println(m);
		  

	}

}
