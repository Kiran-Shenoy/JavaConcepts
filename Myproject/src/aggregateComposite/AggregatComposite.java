package aggregateComposite;
class Coolent
{
	private int quantity;
	private int price;
	public Coolent(int quantity, int price) {
		super();
		this.quantity = quantity;
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getPrice() {
		return price;
	}
	
}

class Circuit
{
	private int voltage;
	 
	public Circuit(int voltage) {
		super();
		this.voltage=voltage;
	}
	

	public int getvoltage() {
		return voltage;
	}
	
}
class Remote
{
	private int temp;
	 
	public Remote(int temp) {
		super();
		this.temp=temp;
	}
	

	public int getTemp() {
		return temp;
	}
	
}

class AC
{
	Coolent c=new Coolent(10,3000);
	Circuit ci=new Circuit(12);
	
	void hasA(Remote r)
	{
		System.out.print(r.getTemp());
	}
	
}

public class AggregatComposite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AC ac=new AC();
		Remote r= new Remote(24);
		
		System.out.println(ac.c.getQuantity());
		System.out.println(ac.ci.getvoltage());
		
		ac.hasA(r);

	}

}
