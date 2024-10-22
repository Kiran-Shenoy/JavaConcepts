package encapsulation;
class BankAccount {
    // Private fields (data hiding)
    private String accountHolderName;
    private double balance;

    // Constructor to initialize fields
    public BankAccount(String name, double initialBalance) {
        this.accountHolderName = name;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting to 0.");
            this.balance = 0;
        }
    }

    // Getter for account holder name
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
            System.out.println("Successfully withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
     }
}


public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("Alice", 500.0);

        // Accessing data through getters
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: " + account.getBalance());

        // Making deposits and withdrawals
        account.deposit(150.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(100.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
   
	}

}
