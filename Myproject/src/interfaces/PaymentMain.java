package interfaces;
//Define the interface
interface Payments {
 void pay(int amount);
}

//Implement the interface in the CreditCard class
class CreditCard implements Payments {
 @Override
 public void pay(int amount) {
     System.out.println("Paid " + amount + " using Credit Card.");
 }
}

//Implement the interface in the PayPal class
class PayPal implements Payments {
 @Override
 public void pay(int amount) {
     System.out.println("Paid " + amount + " using PayPal.");
 }
}

//Implement the interface in the BankTransfer class
class BankTransfer implements Payments {
 @Override
 public void pay(int amount) {
     System.out.println("Paid " + amount + " using Bank Transfer.");
 
    }
}

public class PaymentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Payments creditCardPayment = new CreditCard();
	     Payments payPalPayment = new PayPal();
	     Payments bankTransferPayment = new BankTransfer();

	     creditCardPayment.pay(100);
	     payPalPayment.pay(200);
	     bankTransferPayment.pay(300);
	 
	}

}
