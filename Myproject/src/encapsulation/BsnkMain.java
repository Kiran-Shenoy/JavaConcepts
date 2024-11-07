package encapsulation;

//BankAccount.java - Class representing a bank account
class BankAccounts {
 private String accountNumber;
 private double balance;

 // Constructor to initialize the bank account
 public BankAccounts(String accountNumber, double initialBalance) {
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
 }

 // Getter for accountNumber
 public String getAccountNumber() {
     return accountNumber;
 }

 // Getter for balance
 public double getBalance() {
     return balance;
 }

 // Method to deposit money
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: $" + amount);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 // Method to withdraw money
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrew: $" + amount);
     } else {
         System.out.println("Invalid withdrawal amount or insufficient funds.");
     }

     // Create a BankAccount object
    
 }
}


public class BsnkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BankAccounts account = new BankAccounts("123456789", 500);

	     // Display account details
	     System.out.println("Account Number: " + account.getAccountNumber());
	     System.out.println("Initial Balance: $" + account.getBalance());

	     // Deposit and withdraw money
	     account.deposit(200);
	     System.out.println("Current Balance: $" + account.getBalance());

	     account.withdraw(100);
	     System.out.println("Current Balance: $" + account.getBalance());

	     // Attempt an invalid withdrawal
	     account.withdraw(700);
	}

}
