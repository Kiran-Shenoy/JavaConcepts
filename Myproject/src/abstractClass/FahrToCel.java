package abstractClass;

import java.util.Scanner;

public class FahrToCel {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int f=scan.nextInt();
		
		double c= (5.0/9.0) *(f - 32);
		
		System.out.println(c);
		
	}

}
