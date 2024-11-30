package interfaces;

//Define the Payment interface
interface Payment {
 void processPayment(double amount);
}

//Class implementing the Payment interface for credit card payments
class CreditCardPayment implements Payment {
 @Override
 public void processPayment(double amount) {
     System.out.println("Processing credit card payment of $" + amount);
 }
}

//Class implementing the Payment interface for PayPal payments
class PayPalPayment implements Payment {
 @Override
 public void processPayment(double amount) {
     System.out.println("Processing PayPal payment of $" + amount);
 
  }
}

public class ECommerceSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Create instances of payment methods
	     Payment creditCard = new CreditCardPayment();
	     Payment payPal = new PayPalPayment();

	     // Process payments
	     creditCard.processPayment(150.75);
	     payPal.processPayment(89.50);
	 
	}

}
