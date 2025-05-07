package polymorphism;
import java.util.Scanner;


class Laptop1 {
    void specs() {
        System.out.println("This is a general laptop with basic specs.");
    }
}

class QuantumBook extends Laptop1 {  // Inspired by quantum computing
    @Override
    void specs() {
        System.out.println("QuantumBook: Advanced AI-assisted computing with ultra-fast processing!");
    }
}

class Zephyrus extends Laptop1 {  // Named after Asus ROG Zephyrus gaming laptops
    @Override
    void specs() {
        System.out.println("Zephyrus: High-performance gaming laptop with extreme cooling!");
    }
}

class ThinkGear extends Laptop1 {  // ThinkPad + futuristic tech
    @Override
    void specs() {
        System.out.println("ThinkGear: Precision-driven AI-enhanced productivity machine.");
    }
}

class AeroBlade extends Laptop1 {  // Inspired by cooling fans in gaming laptops
    @Override
    void specs() {
        System.out.println("AeroBlade: Ultra-thin powerhouse with next-gen thermal efficiency!");
    }
}

public class Laptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("Enter the laptop model (QuantumBook / Zephyrus / ThinkGear / AeroBlade): ");
		        String input = scanner.nextLine().trim();
		        
		        Laptop1 laptop;
		        
		        switch (input.toLowerCase()) {
		            case "quantumbook":
		                laptop = new QuantumBook();
		                break;
		            case "zephyrus":
		                laptop = new Zephyrus();
		                break;
		            case "thinkgear":
		                laptop = new ThinkGear();
		                break;
		            case "aeroblade":
		                laptop = new AeroBlade();
		                break;
		            default:
		                System.out.println("Unknown model, using base laptop class.");
		                laptop = new Laptop1();
		                break;
		        }

	}

}
