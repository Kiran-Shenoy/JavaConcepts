package strings;

import java.util.Scanner;

public class Concate {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String str1=scan.next();
		String str2 = scan.next();
		
		
		String res= str1 + " " +str2;
		
		
		System.out.println(res);

	}

}