package staticConcept;

import java.util.Scanner;

class Business
{
	private float si;
	private float p;
	private float t;
	static float r;
	static
	{
		r=15.2f;
	}
	public void acceptInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the principle amount:");
		p=scan.nextFloat();
		System.out.println("enter the tenure");
		t=scan.nextFloat();
	}
	public void calcInterest()
	{
		si=(p*t*r)/100;
	}
	public void display()
	{
		System.out.println("Simple Interest: "+si);
	}
}

public class Dealing {

	public static void main(String[] args) {
		Business b1=new Business();
		b1.acceptInput();
		b1.calcInterest();
		b1.display();
		
		
		Business b2=new Business();
		b2.acceptInput();
		b2.calcInterest();
		b2.display();
		
		
		Business b3=new Business();
		b3.acceptInput();
		b3.calcInterest();
		b3.display();
		

	}

}
