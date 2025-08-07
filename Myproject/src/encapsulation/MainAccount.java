package encapsulation;
import java.util.Scanner;

class Account1 {
    // Private fields (encapsulated)
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Public getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
    }
}
public class MainAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        Account1 account = new Account1();

		        // Taking user input
		        System.out.print("Enter Account Number: ");
		        account.setAccountNumber(scanner.nextLine());

		        System.out.print("Enter Account Holder Name: ");
		        account.setAccountHolderName(scanner.nextLine());

		        System.out.print("Enter Initial Balance: ₹");
		        double initialBalance = scanner.nextDouble();
		        account.setBalance(initialBalance);

		        // Displaying account info
		        account.displayAccountInfo();

		        scanner.close();
		   

	}

}
