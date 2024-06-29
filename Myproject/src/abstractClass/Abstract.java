package abstractClass;
abstract class Animal1{
	abstract void eat();
	abstract void sleep();
	
}

class Deer extends Animal1
{
	void eat()
	{
		System.out.println("Deer eats grass");
	}
	void sleep()
	{
		System.out.println("Deer sleeps peacefully");
	}
}
class Tiger extends Animal1
{
	void eat()
	{
		System.out.println("Tiger eats deer");
	}
	void sleep()
	{
		System.out.println("Tiger sleeps with Tigress");
	}
}
class Monkey extends Animal1
{
	void eat()
	{
		System.out.println("Monkey eats banana");
	}
	void sleep()
	{
		System.out.println("Monkey sleeps on tree");
	}
}

class Anima
{
	void permit(Animal1 a)
	{
		a.eat();
		a.sleep();
	}
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anima an=new Anima();
		
		Deer d=new Deer();
		an.permit(d);
		
		Tiger t=new Tiger();
		an.permit(t);
		
		
		Monkey m=new Monkey();
		an.permit(m);
		
		

	}

}
