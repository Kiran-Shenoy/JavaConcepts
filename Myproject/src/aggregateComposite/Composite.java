package aggregateComposite;
import java.util.List;
import java.util.ArrayList;


class Item {
    String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Order {
    private String orderId;
    private List<Item> items;

    public Order(String orderId) {
        this.orderId = orderId;
        items = new ArrayList<>();
    }

    public void addItem(String itemName) {
        Item item = new Item(itemName);
        items.add(item);
    }

    public void displayOrderItems() {
        System.out.println("Items in Order ID: " + orderId);
        for (Item item : items) {
            System.out.println(item.getName());
        }
    }
}

        

public class Composite {

	public static void main(String[] args) {
		Order order = new Order("ORD123");

        // Items cannot exist independently of an order
        order.addItem("Laptop");
        order.addItem("Mouse");

        order.displayOrderItems();
    }
}

