package polymorphism;

class Plane
{
	public void fly()
	{
	  System.out.println("Plane is flying");
	}
}
class CargoPlane extends Plane
{
	public void fly()
	{
	  System.out.println("CargoPlane is flying low height");
	}
	public void carryCargo()
	{
		 System.out.println("CargoPlane is carrying cargo");
	}
}

class PassengerPlane extends Plane
{
	public void fly()
	{
	  System.out.println("PassengerPlane is flying medium height");
	}
	public void carryPassengers()
	{
		 System.out.println("PassengerPlane is carrying passengers");
	}
}
class FighterPlane extends Plane
{
	public void fly()
	{
	  System.out.println("FighterPlane is flying great height");
	}
	public void carryWeapons()
	{
		 System.out.println("FighterPlane is carrying weapons");
	}
}
public class DemoPlane {

	public static void main(String[] args) {
		
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		
		
		Plane ref;
		ref=cp;
		ref.fly();
		((CargoPlane) ref).carryCargo();
	
		ref=pp;
		ref.fly();
		((PassengerPlane) ref).carryPassengers();
	
		ref=fp;
		ref.fly();
		((FighterPlane) ref).carryWeapons();
		
		

	}

}
