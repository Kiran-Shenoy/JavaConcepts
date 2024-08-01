package arrayprograms;

import java.util.Scanner;

public class MathTable {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        for(int i=1;i<=10;i++)
        {
        	System.out.println(n+" X "+i+" = "+n*i);
        }
        System.out.println();
	}

}
