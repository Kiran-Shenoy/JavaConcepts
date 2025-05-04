package collections;
import java.util.*;
public class DemoCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	
		        Scanner sc = new Scanner(System.in);
		        List<String> elixirList = new ArrayList<>();
		        Set<String> nebulaSet = new HashSet<>();
		        Map<Integer, String> arcaneMap = new HashMap<>();

		        System.out.println("Enter three mystical words for the list:");
		        for (int i = 0; i < 3; i++) {
		            elixirList.add(sc.nextLine());
		        }

		        System.out.println("Enter three unique stellar words for the set:");
		        for (int i = 0; i < 3; i++) {
		            nebulaSet.add(sc.nextLine());
		        }

		        System.out.println("Enter three key-value pairs for the map:");
		        for (int i = 0; i < 3; i++) {
		            System.out.print("Key (integer): ");
		            int key = sc.nextInt();
		            sc.nextLine(); // Consume newline
		            System.out.print("Value (string): ");
		            String value = sc.nextLine();
		            arcaneMap.put(key, value);
		        }

		        System.out.println("\nCollected Elements:");
		        System.out.println("Elixir List: " + elixirList);
		        System.out.println("Nebula Set: " + nebulaSet);
		        System.out.println("Arcane Map: " + arcaneMap);

		        sc.close();
		    

	}

}
