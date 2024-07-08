package interfaces;

import java.util.Scanner;


interface Calculator 
{
	public void add();
	public void sub();
}

class MyCalculator1 implements Calculator
{

	@Override
	public void add() {
		
		int a=100;
		int b=200;
		System.out.println(a+b);
		
	}

	@Override
	public void sub() {
		int a=200;
		int b=100;
		System.out.println(a-b);
		
	}
	
}

class MyCalculator2 implements Calculator
{
	Scanner scan=new Scanner(System.in);
	@Override
	public void add() {
		System.out.println("enter the values:");
		int x=scan.nextInt();
		int y=scan.nextInt();
		System.out.println(x+y);
		
	}

	@Override
	public void sub() {
		System.out.println("enter the values:");
		int x=scan.nextInt();
		int y=scan.nextInt();
		System.out.println(x-y);
		
	}
	
}

class MyCalculator3 implements Calculator
{
	Scanner scan=new Scanner(System.in);
	@Override
	public void add() {
		System.out.println("enter the values:");
		int m=scan.nextInt();
		int n=scan.nextInt();
		System.out.println(m+n);
		
	}

	@Override
	public void sub() {
		System.out.println("enter the values:");
		int m=scan.nextInt();
		int n=scan.nextInt();
		System.out.println(m-n);
		
	}
	
}

public class Calculation {

	public static void main(String[] args) {
		
		MyCalculator1 m1=new MyCalculator1();
		MyCalculator2 m2=new MyCalculator2();
		MyCalculator3 m3=new MyCalculator3();
		
		m1.add();
		m1.sub();
		
		m2.add();
		m2.sub();
		
		m3.add();
		m3.sub();
		
	
	}

}
