package abstractClass;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		if(n%3==0 && n%5==0)
		{
			System.out.println("TapAcademy");
		}
		else if(n%3==0)
		{
			System.out.println("Tap");
		}
		else if(n%5==0)
		{
			System.out.println("Academy");
		}

	}

}
