package inheritance;

class Plane
{
	
}
class CargoPlane extends Plane
{
	
}

class Parent
{
	public Plane fun()
	{
		System.out.println("Parent fun()");
		Plane p=new Plane();
		return p;
		
	}
}
class Child extends Parent
{
	public CargoPlane fun()
	{
		System.out.println("Inside Child fun()");
		CargoPlane cp=new CargoPlane();
		return cp;
		
	}
}
public class Rule3 {

	public static void main(String[] args) {
		
		Child c=new Child();
		
		c.fun();
		

	}

}
