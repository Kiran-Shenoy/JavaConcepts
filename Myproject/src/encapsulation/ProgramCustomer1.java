package encapsulation;
class Customer
{
	private int cId;
	private String cName;
	private long cNum;
	
	public Customer(int cId,String cName,long cNum ) {
		this.cId = cId;
		this.cName=cName;
		this.cNum=cNum;
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

public class ProgramCustomer1 {

	public static void main(String[] args) {
		Customer c=new Customer(1,"shenoy",9876543213L);
		
		
		System.out.println(c.getcId());
		System.out.println(c.getcName());
		System.out.println(c.getcNum());
		
		

	}

}
