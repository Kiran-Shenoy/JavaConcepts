package inheritance;

class Object
{
	
}
class Test1 extends Object
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
			a=300;
			b=400;
		}
		
		Test2(int a,int b)
		{
			this.a=b;
			this.a=b;
		}
		
		void disp()
		{
			System.out.println(x);
			System.out.println(y);
			System.out.println(a);
			System.out.println(b);
		}
	 
 }
public class Account {

	public static void main(String[] args) {
		Test2 t=new Test2();
		
		t.disp();
		
		

	}

}
