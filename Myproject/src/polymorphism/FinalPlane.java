package polymorphism;

class Plane1
{
	public void takeOff()
	{
		System.out.println("Plane is Taking off");
	}
	public void fly()
	{
	  System.out.println("Plane is flying");
	}
	public void land()
	{
		System.out.println("Plane is landing");
	}
}
class CargoPlane1 extends Plane1
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

class PassengerPlane1 extends Plane1
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
class FighterPlane1 extends Plane1
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

class Airport
{
	public void permit(Plane1 ref)
	{
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}

public class FinalPlane {

	public static void main(String[] args) {
		
		CargoPlane1 cp=new CargoPlane1();
		PassengerPlane1 pp=new PassengerPlane1();
		FighterPlane1 fp=new FighterPlane1();
		
		Airport a=new Airport();
		a.permit(cp);
		a.permit(pp);
		a.permit(fp);

	}

}
