package methodOverload;
class Bank {
    double getInterestRate() {
        return 0.0;
    }
}

class SBI extends Bank {
    
    double getInterestRate() {
        return 5.0;
    }
}

class HDFC extends Bank {
    
    double getInterestRate() {
        return 6.5;
    }
}
public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		        Bank sbi = new SBI();
		        Bank hdfc = new HDFC();

		        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
		        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
		   

	}

}
