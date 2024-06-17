package Singleton;
interface Services
{
	void name();
}
class Car
{

	static Car c=new Car();

	public static Car getC() {
		return c;
	}
	private Car()
	{
		
	}
	
}
class Honda implements Services
{
	public void name()
	{Car c=Car.getC();
	System.out.println("address of honda"+c+"in India");
	}
}
class Suzuki implements Services
{
	public void name()
	{Car c=Car.getC();
	System.out.println("address of Suzuki"+c+"in India");
	}
}
class Toyota  implements Services
{
	public void name()
	{Car c=Car.getC();
	System.out.println("address of toyota"+c+"in India");
	}
}

public class Launchservices {

	public static void main(String[] args) {
		Services s=new Honda();
		Services s1=new Suzuki();
		Services s2=new Toyota();
		
		s.name();
		s1.name();
		s2.name();

	}
}

