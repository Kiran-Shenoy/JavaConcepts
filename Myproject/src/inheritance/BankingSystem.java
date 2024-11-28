package inheritance;


//Parent class
class Bank {
 String bankName = "Generic Bank";

 // Method in the parent class
 void displayBankInfo() {
     System.out.println("Welcome to " + bankName);
 }
}

//Child class inheriting from Bank
class SavingsAccount extends Bank {
 double interestRate = 3.5;

 // Method specific to SavingsAccount
 void displayInterestRate() {
     System.out.println("Savings Account Interest Rate: " + interestRate + "%");
 }
}

//Another child class inheriting from Bank
class CurrentAccount extends Bank {
 double overdraftLimit = 50000;

 // Method specific to CurrentAccount
 void displayOverdraftLimit() {
     System.out.println("Current Account Overdraft Limit: $" + overdraftLimit);
 
    }
}

public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create object of SavingsAccount
	     SavingsAccount savings = new SavingsAccount();
	     savings.bankName = "National Savings Bank";
	     savings.displayBankInfo();
	     savings.displayInterestRate();

	     // Create object of CurrentAccount
	     CurrentAccount current = new CurrentAccount();
	     current.bankName = "National Current Bank";
	     current.displayBankInfo();
	     current.displayOverdraftLimit();

	}

}
