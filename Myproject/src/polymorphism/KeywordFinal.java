package polymorphism;


class Test
{
	final int a=100;
}
public class KeywordFinal {

	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t.a);
		t.a=999;
		System.out.println(t.a);

	}

}
