package polymorphism;

//Base class
class Bank {
 // Method that will be overridden
 double getInterestRate() {
     return 0;
 }
}

//Derived class for specific bank
class BankA extends Bank {
 @Override
 double getInterestRate() {
     return 4.5; // BankA offers 4.5% interest
 }
}

//Another derived class for different bank
class BankB extends Bank {
 @Override
 double getInterestRate() {
     return 5.0; // BankB offers 5.0% interest
 }
}

//Another derived class for different bank
class BankC extends Bank {
 @Override
 double getInterestRate() {
     return 5.5; // BankC offers 5.5% interest
 }
}

   

public class BankPoly {

	public static void main(String[] args) {
		  Bank bank1 = new BankA();
		     Bank bank2 = new BankB();
		     Bank bank3 = new BankC();
		     
		     // Displaying the interest rates offered by different banks
		     System.out.println("BankA interest rate: " + bank1.getInterestRate() + "%");
		     System.out.println("BankB interest rate: " + bank2.getInterestRate() + "%");
		     System.out.println("BankC interest rate: " + bank3.getInterestRate() + "%");
		 
	}

}
