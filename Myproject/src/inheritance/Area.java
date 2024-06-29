package inheritance;
import java.util.Scanner;
class Shape
{
	float area;
	Scanner scan=new Scanner(System.in);
	void input()
	{
		
	}
	void calculate()
	{
		
	}
	void disp()
	{
		System.out.print(area);
	}
	
}

class Square extends Shape
{
	float side;
	void input()
	{
		side=scan.nextFloat();
	}
	void calculate()
	{
		area=side*side;
	}
	
}

class Rectangle extends Shape
{
	float l,b;
	void input()
	{
		l=scan.nextFloat();
		b=scan.nextFloat();
	}
	void calculate()
	{
		area=l*b;
	}
	
}
class Circle extends Shape
{
	float pi=3.142f;
	float r;
	void input()
	{
		r=scan.nextFloat();
	}
	void calculate()
	{
		area=pi*r*r;
	}
	
}
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square s=new Square();
		Rectangle r= new Rectangle();
		Circle c=new Circle();
		
		
		s.input();
		s.calculate();
		s.disp();
		
		r.input();
		r.calculate();
		r.disp();

		
		c.input();
		c.calculate();
		c.disp();


	}

}
