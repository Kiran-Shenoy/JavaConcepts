package encapsulation;

//BankAccount class demonstrating encapsulation
class BankAccount {
 // Private variables to hide data
 private String accountHolderName;
 private double balance;

 // Constructor to initialize account details
 public BankAccount(String name, double initialBalance) {
     this.accountHolderName = name;
     if (initialBalance >= 0) {
         this.balance = initialBalance;
     } else {
         System.out.println("Initial balance can't be negative.");
         this.balance = 0;
     }
 }

 // Getter for account holder's name
 public String getAccountHolderName() {
     return accountHolderName;
 }

 // Getter for balance
 public double getBalance() {
     return balance;
 }

 // Method to deposit money
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Successfully deposited: " + amount);
     } else {
         System.out.println("Deposit amount must be positive.");
     }
 }

 // Method to withdraw money
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Successfully withdrawn: " + amount);
     } else {
         System.out.println("Insufficient balance or invalid amount.");
     }
 
  
 }
}


public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Create a new bank account with initial balance
	     BankAccount account = new BankAccount("John Doe", 500);

	     // Display account details
	     System.out.println("Account Holder: " + account.getAccountHolderName());
	     System.out.println("Current Balance: " + account.getBalance());

	     // Perform deposit and withdrawal operations
	     account.deposit(200);
	     System.out.println("Updated Balance: " + account.getBalance());

	     account.withdraw(150);
	     System.out.println("Updated Balance: " + account.getBalance());

	     // Attempt to withdraw an invalid amount
	     account.withdraw(600);
	}

}
