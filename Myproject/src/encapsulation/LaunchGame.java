package encapsulation;

class CustomerGame
{
	private int cId;
	private String cName;
	private long cNum;
	
	public CustomerGame()
	{
		cId = 2;
		cName="kiran";
		cNum=90897865436L;	
	}
	public CustomerGame(String cName) {
		this();
		this.cName=cName;
		
	}
	
	public CustomerGame(int cId,String cName,long cNum ) {
		this(cName);
	
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

public class LaunchGame {

	public static void main(String[] args) {
		CustomerGame c=new CustomerGame(1,"shenoy",9876543213L);
		
		
		System.out.println(c.getcId());
		System.out.println(c.getcName());
		System.out.println(c.getcNum());
		

	}

}
