package encapsulation;


class BankAccount {
    // Private fields (encapsulation)
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting to 0.");
            this.balance = 0;
        }
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
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
     }
}

public class DemoBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Create a BankAccount object
        BankAccount account = new BankAccount("John Doe", 500);

        // Display account details
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Current Balance: $" + account.getBalance());

        // Deposit money
        account.deposit(200);

        // Withdraw money
        account.withdraw(100);

        // Attempt invalid withdrawal
        account.withdraw(700);

        // Update account holder name
        account.setAccountHolderName("Jane Doe");
        System.out.println("Updated Account Holder: " + account.getAccountHolderName());
  
	}

}
