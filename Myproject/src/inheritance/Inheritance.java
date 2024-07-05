package inheritance;
class Test1
{
	int x,y;
	
	Test1()
	{
		x=100;
		y=200;
	}
	Test1(int x,int y)
	{
		this.x=x;
		this.y=y;
		
	}
}
class Test2 extends Test1
{
	int a,b;
	
	Test2()
	{
		this(9,99);
		a=300;
		b=400;
	}
	
	Test2(int a,int b)
	{
		super();
		this.a=a;
		this.b=b;
	}
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
	
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test2 t2=new Test2();
		t2.disp();
		
		

	}

}
