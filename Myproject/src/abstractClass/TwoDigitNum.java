package abstractClass;

import java.util.Scanner;

public class TwoDigitNum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		
		if(n>9 && n<100)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

	}

}
