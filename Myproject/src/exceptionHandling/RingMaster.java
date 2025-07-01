package exceptionHandling;
import java.util.Scanner;

class PowerRing {
    private int age;

    public void setCharge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Ring energy level (age) cannot be negative.");
        }
        this.age = age;
    }

    public int getCharge() {
        return age;
    }
}


public class RingMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        PowerRing ring = new PowerRing();

		        try {
		            System.out.print("Enter your ring's energy level (age): ");
		            String input = scanner.nextLine();
		            int age = Integer.parseInt(input);

		            ring.setCharge(age);

		            System.out.println("🔋 Ring energy level accepted: " + ring.getCharge());
		        } catch (NumberFormatException e) {
		            System.out.println("❌ Invalid input. Please enter a number.");
		        } catch (IllegalArgumentException e) {
		            System.out.println("❌ Error: " + e.getMessage());
		        } catch (Exception e) {
		            System.out.println("❌ Unexpected issue: " + e.getMessage());
		        } finally {
		            scanner.close();
		        }
		   
	}

}
