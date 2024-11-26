package polymorphism;


//Base class
class Payment {
 public void processPayment() {
     System.out.println("Processing a generic payment.");
 }
}

//Derived class for Credit Card Payment
class CreditCardPayment extends Payment {
 @Override
 public void processPayment() {
     System.out.println("Processing payment through Credit Card.");
 }
}

//Derived class for PayPal Payment
class PayPalPayment extends Payment {
 @Override
 public void processPayment() {
     System.out.println("Processing payment through PayPal.");
 }
}

//Derived class for Bank Transfer Payment
class BankTransferPayment extends Payment {
 @Override
 public void processPayment() {
     System.out.println("Processing payment through Bank Transfer.");
}
}

public class PolyExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     // Using polymorphism to handle different payment types
	     Payment payment1 = new CreditCardPayment();
	     Payment payment2 = new PayPalPayment();
	     Payment payment3 = new BankTransferPayment();

	     payment1.processPayment();  // Output: Processing payment through Credit Card.
	     payment2.processPayment();  // Output: Processing payment through PayPal.
	     payment3.processPayment();  // Output: Processing payment through Bank Transfer.
	 
	}

}
