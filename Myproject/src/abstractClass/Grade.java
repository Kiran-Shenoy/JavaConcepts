package abstractClass;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int per = scan.nextInt();
		
		if(per >=80)
		{
			System.out.println("Distinction");
		}
		else if(per > 60 && per<=79)
		{
			System.out.println("First");
		}
		else if(per >=40 && per <=59)
		{
			System.out.println("Second");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
