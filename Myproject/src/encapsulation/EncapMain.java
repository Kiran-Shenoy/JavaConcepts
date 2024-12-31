package encapsulation;

//Class representing a bank account
class BankAccount {
 // Private data members
 private String accountHolderName;
 private double balance;

 // Constructor
 public BankAccount(String accountHolderName, double initialBalance) {
     this.accountHolderName = accountHolderName;
     this.balance = initialBalance;
 }

 // Getter for accountHolderName
 public String getAccountHolderName() {
     return accountHolderName;
 }

 // Setter for accountHolderName
 public void setAccountHolderName(String accountHolderName) {
     this.accountHolderName = accountHolderName;
 }

 // Getter for balance
 public double getBalance() {
     return balance;
 }

 // Method to deposit money
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
     } else {
         System.out.println("Deposit amount must be positive.");
     }
 }

 // Method to withdraw money
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
     } else {
         System.out.println("Insufficient balance or invalid amount.");
     }

    }
}

public class EncapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Creating a BankAccount object
	     BankAccount account = new BankAccount("Alice", 1000);

	     // Accessing and modifying data using methods
	     System.out.println("Account Holder: " + account.getAccountHolderName());
	     System.out.println("Initial Balance: $" + account.getBalance());

	     account.deposit(500);
	     System.out.println("Balance after deposit: $" + account.getBalance());

	     account.withdraw(300);
	     System.out.println("Balance after withdrawal: $" + account.getBalance());

	}

}

