package encapsulation;

public class Purse {
	
	    // Private fields - data hiding
	    private double money;
	    private String color;

	    // Public constructor to initialize Purse
	    public Purse(double initialMoney, String purseColor) {
	        this.money = initialMoney;
	        this.color = purseColor;
	    }

	    // Public method to add money to the purse
	    public void addMoney(double amount) {
	        if (amount > 0) {
	            this.money += amount;
	        }
	    }

	    // Public method to spend money from the purse
	    public void spendMoney(double amount) {
	        if (amount > 0 && amount <= this.money) {
	            this.money -= amount;
	        }
	    }

	    // Public method to get the current amount of money in the purse
	    public double getMoney() {
	        return this.money;
	    }

	    // Public method to get the color of the purse
	    public String getColor() {
	        return this.color;
	    }

	    // Public method to set the color of the purse
	    public void setColor(String color) {
	        this.color = color;
	    }

	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Purse myPurse = new Purse(100.0, "Red");

        // Adding money to the purse
        myPurse.addMoney(50.0);
        System.out.println("Current Money: " + myPurse.getMoney());

        // Spending money from the purse
        myPurse.spendMoney(30.0);
        System.out.println("Current Money: " + myPurse.getMoney());

        // Changing the color of the purse
        myPurse.setColor("Blue");
        System.out.println("Purse Color: " + myPurse.getColor());
   
	}

}
