package polymorphism;
class Weapon {
    void attack() {
        System.out.println("Weapon is attacking!");
    }
}

// Child class
class Sword extends Weapon {
    @Override
    void attack() {
        System.out.println("Sword slashes the enemy!");
    }
}

// Another child class
class Bow extends Weapon {
    @Override
    void attack() {
        System.out.println("Bow shoots an arrow!");
    }
}

// Another child class
class Gun extends Weapon {
    @Override
    void attack() {
        System.out.println("Gun fires a bullet!");
    }
}

public class Ayudha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Parent class
	
		
		        Weapon myWeapon; // Reference of type Weapon
		        
		        myWeapon = new Sword();
		        myWeapon.attack(); // Outputs: Sword slashes the enemy!

		        myWeapon = new Bow();
		        myWeapon.attack(); // Outputs: Bow shoots an arrow!

		        myWeapon = new Gun();
		        myWeapon.attack(); // Outputs: Gun fires a bullet!
		    
	}

}
