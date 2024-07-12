package strings;

import java.util.Scanner;

public class PrintingIndex {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);


		String s=scan.nextLine();
		char ch=scan.next().charAt(0);

		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				System.out.println(i);
		}
			else
			{
				System.out.println("-1");
				break;
			}
		}
	}

}
