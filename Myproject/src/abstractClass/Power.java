package abstractClass;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int x=scan.nextInt();
		int n=scan.nextInt();
		
		
		int res= (int) Math.pow(x,n);
		
		System.out.println(res);

	}

}
