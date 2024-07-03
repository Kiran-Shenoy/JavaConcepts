package encapsulation;


class Customer1
{
	private int cId;
	private String cName;
	private long cNum;
	
	public Customer1()
	{
		cId = 1;
		cName="kiran";
		cNum=90897865436L;	
	}
	
	public Customer1(int cId,String cName,long cNum ) {
		this();
	
	}
	
	public int getcId() {
		return cId;
	}
	
	public String getcName() {
		return cName;
	}
	
	public long getcNum() {
		return cNum;
	}
}
public class LaunchConstructor {

	public static void main(String[] args) {
	Customer1 c=new Customer1(1,"shenoy",9876543213L);
		
		
		System.out.println(c.getcId());
		System.out.println(c.getcName());
		System.out.println(c.getcNum());
		

	}

}
