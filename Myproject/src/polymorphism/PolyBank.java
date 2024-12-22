package polymorphism;

//Parent class
class Bank {
 // Method to be overridden
 public double getInterestRate() {
     return 0.0;
 }
}

//Child class 1
class SavingsBank extends Bank {
 @Override
 public double getInterestRate() {
     return 4.5; // Savings account interest rate
 }
}

//Child class 2
class CurrentBank extends Bank {
 @Override
 public double getInterestRate() {
     return 3.0; // Current account interest rate
 }
}

//Child class 3
class FixedDepositBank extends Bank {
 @Override
 public double getInterestRate() {
     return 6.5; // Fixed deposit interest rate
  }
}

public class PolyBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     // Parent reference, child objects
	     Bank bank;

	     bank = new SavingsBank();
	     System.out.println("Savings Account Interest Rate: " + bank.getInterestRate() + "%");

	     bank = new CurrentBank();
	     System.out.println("Current Account Interest Rate: " + bank.getInterestRate() + "%");

	     bank = new FixedDepositBank();
	     System.out.println("Fixed Deposit Interest Rate: " + bank.getInterestRate() + "%");

	}

}
