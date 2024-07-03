package encapsulation;

class BankAcc
{
	private float bal;
	public void setData(float x)
	{
		if(x>0)
		{
		bal=x;
	}
	}
	public float getBal() {
		return bal;
	}
	
}

public class ProgramEncap1 {

	public static void main(String[] args) {
		BankAcc ba=new BankAcc();
		
		ba.setData(10000);
		System.out.println(ba.getBal());
		
		

	}

}
