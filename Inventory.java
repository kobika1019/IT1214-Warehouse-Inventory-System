import java.util.HashMap;

public class Inventory {

    private HashMap<String, Item> items;

    public Inventory() {
        items = new HashMap<>();
    }

    // Add Item
    public void addItem(Item item) {

        if (items.containsKey(item.getItemId())) {
            System.out.println("Error: Item ID already exists!");
            return;
        }

        items.put(item.getItemId(), item);
        System.out.println("Item added successfully.");
    }

    // Remove Item
    public void removeItem(String itemId) {

        if (items.remove(itemId) != null) {
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

    // Update Quantity
    public void updateQuantity(String itemId, int quantity) {

        if (quantity < 0) {
            System.out.println("Quantity cannot be negative.");
            return;
        }

        Item item = items.get(itemId);

        if (item != null) {
            item.setQuantity(quantity);
            System.out.println("Quantity updated successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

    // Search by ID
    public void searchById(String itemId) {

        Item item = items.get(itemId);

        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Item not found.");
        }
    }

    // Search by Name
    public void searchByName(String itemName) {

        boolean found = false;

        for (Item item : items.values()) {

            if (item.getItemName().equalsIgnoreCase(itemName)) {

                System.out.println(item);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Item not found.");
        }
    }

    // Display All Items
    public void displayAllItems() {

        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        System.out.println("\n===== Inventory Items =====");

        for (Item item : items.values()) {
            System.out.println(item);
        }
    }
}