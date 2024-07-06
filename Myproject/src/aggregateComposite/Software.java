package aggregateComposite;

class OS
{
	private String name;
	private int size;
	public OS(String name,int size)
	{
		super();
		this.name=name;
		this.size=size;
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
	
}

class Charger
{
	private String Brand;
	private float voltage;
	public Charger(String Brand,float voltage)
	{
		super();
		this.Brand=Brand;
		this.voltage=voltage;
	}
	public String getBrand() {
		return Brand;
	}
	public float getVoltage() {
		return voltage;
	}
	
}
class Mobile
{
    OS os=new OS("Android", 512);
    
    void hasA(Charger c)
    {
    	System.out.println(c.getBrand());
    	System.out.println(c.getVoltage());
    	
    }
}

public class Software {

	public static void main(String[] args) {
		
	    Charger c=new Charger("Samsung",24.5f);
	    
	    Mobile mb=new Mobile();
	    System.out.println(mb.os.getName());
	    System.out.println(mb.os.getSize());
	    
	    mb.hasA(c);
	    
	    mb=null;
//	    System.out.println(mb.os.getName());
//	    System.out.println(mb.os.getSize());
//	    mb.hasA(c);
	   
	    
	    System.out.println(c.getBrand());
    	System.out.println(c.getVoltage());
	    
	    
	    
	

	}

}
