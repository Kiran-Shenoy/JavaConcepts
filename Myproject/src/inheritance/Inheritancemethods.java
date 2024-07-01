package inheritance;
class Bird
{
	void eat()
	{
		System.out.println("eat bird");
	}
	void fly()
	{
		System.out.println("fly bird");
		
	}
	
}

class Eagle extends Bird
{
	void fly()
	{
		System.out.println("fly eagle");
	}
	
}
class Sparrow extends Bird
{
	void eat()
	{
		System.out.println("eat sparrow");
	}
	
}

class Serpenteagle extends Eagle
{
	void eat()
	{
		System.out.println("eat serpent");
	}
	void fly()
	{
		System.out.println("fly serpent");
	}
	
}
class Goldeneagle extends Eagle
{
	void eat()
	{
		System.out.println("eat golden");
	}
	void fly()
	{
		System.out.println("fly golden");
	}
//	void sleep()
//	{
//		System.out.println("golden sleeps");
//	}
//	
}

class Animal
{
	void permit(Bird ref)
	{
		ref.eat();
		ref.fly();
	}
}
public class Inheritancemethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		
		
		Serpenteagle s=new Serpenteagle();
		a.permit(s);
	
		
		Goldeneagle e=new Goldeneagle();
		a.permit(e);
	
		
		Sparrow sp=new Sparrow();
		a.permit(sp);
	
		
		
		
		

	}

}
