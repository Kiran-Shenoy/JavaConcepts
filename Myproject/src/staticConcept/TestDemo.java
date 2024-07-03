package staticConcept;

class Test
{
	static int a,b;
	static
	{
		System.out.println("inside static block");
		a=10;
		b=20;
	}
	
	static void fun()
	{
		System.out.println("inside static method");
	}
	int x,y;
	{
		System.out.println("inside instance block");
	}
	void fun2()
	{
		System.out.println("inside instance method");
		
	}
	Test()
	{
		System.out.println("inside constructor");
		x=30;
		y=40;
	}
}

public class TestDemo {

	public static void main(String[] args) {
		Test.fun();
		Test t=new Test();
	    t.fun2();
	    
	    
	
	}

}
