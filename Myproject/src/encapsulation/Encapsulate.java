package encapsulation;


//Encapsulated class
class BankAccountt {
 // Private fields
 private String accountHolderName;
 private double balance;
 private String accountNumber;

 // Constructor
 public BankAccountt(String accountHolderName, String accountNumber, double initialBalance) {
     this.accountHolderName = accountHolderName;
     this.accountNumber = accountNumber;
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

 // Deposit method
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: " + amount);
     } else {
         System.out.println("Invalid deposit amount!");
     }
 }

 // Withdraw method
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrew: " + amount);
     } else {
         System.out.println("Invalid withdrawal amount!");
     }

  }
}

public class Encapsulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Creating a BankAccount object
	     BankAccountt account = new BankAccountt("John Doe", "1234567890", 1000.0);

	     // Accessing and modifying data using encapsulated methods
	     System.out.println("Account Holder: " + account.getAccountHolderName());
	     System.out.println("Initial Balance: " + account.getBalance());

	     // Deposit and withdrawal operations
	     account.deposit(500.0);
	     account.withdraw(300.0);

	     System.out.println("Final Balance: " + account.getBalance());
	 
	}

}
