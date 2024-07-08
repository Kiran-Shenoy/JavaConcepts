package interfaces;

interface Calculator12
{
	public void add();
	public void sub();
}
class  Calculator123
{
	public void mul() {
		int a =8;
		int b=10;
		int c=a*b;
		System.out.println(c);
	}
	
	public void div() {
		int a =200;
		int b=10;
		int c=a/b;
		System.out.println(c);
	}
}
class MyCalculator extends Calculator123 implements Calculator12
{

	@Override
	public void add() {
		int a=23;
		int b=34;
		int c=a+b;
		System.out.println(c);
		
		
	}

	@Override
	public void sub() {
		int a=23;
		int b=34;
		int c=a-b;
		System.out.println(c);
		
	}
	
}
public class Rule9Interface {

	public static void main(String[] args) {
		
		MyCalculator my=new MyCalculator();
		my.add();
		my.sub();
		my.mul();
		my.div();
		

	}

}
