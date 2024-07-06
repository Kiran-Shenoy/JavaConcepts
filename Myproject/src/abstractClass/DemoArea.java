package abstractClass;

import java.util.Scanner;

abstract class Shape
{
	float area;
	Scanner scan=new Scanner(System.in);
	abstract public void acceptInput();
	abstract public void calcArea();
	
	public void dispArea()
	{
		System.out.println(area);
	}
}
class Square extends Shape
{
	float side;
	public void acceptInput()
	{
		System.out.println("Enter the side:");
		side=scan.nextFloat();
	}
	public void calcArea()
	{
		area=side*side;
	}
	
}

class Rectangle extends Shape
{
	float l,b;
	public void acceptInput()
	{
		System.out.println("Enter length and breadth:");
		l=scan.nextFloat();
		b=scan.nextFloat();
	}
	public void calcArea()
	{
		area=l*b;
	}
	
}
class Circle extends Shape
{
	float pi=3.142f;
	float r;
	public void acceptInput()
	{
		System.out.println("Enter the radius:");
		r=scan.nextFloat();
	}
	public void calcArea()
	{
		area=pi*r*r;
	}
	
}

class Geometry
{
	public void permit(Shape ref)
	{
		ref.acceptInput();
		ref.calcArea();
		ref.dispArea();
	}
}
public class DemoArea {

	public static void main(String[] args) {
		
		Square s=new Square();
		Rectangle r= new Rectangle();
		Circle c=new Circle();
		
		Geometry g=new Geometry();
		
		g.permit(s);
		g.permit(r);
		g.permit(c);
		

	}

}
