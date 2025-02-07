package strings;

import java.util.Scanner;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		   
		   String s1 = scanner.nextLine();
		   
		   String s2 = scanner.nextLine();
		   
		   
		   boolean r = s1.contains(s2);
		   
		   System.out.println(r);
	}

}
