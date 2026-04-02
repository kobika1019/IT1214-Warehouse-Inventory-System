import java.util.ArrayList;

class Inventory {
    private ArrayList<Item> items = new ArrayList<>();

    // Add item
    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item added successfully!");
    }

    // Remove item
    public void removeItem(String id) {
        for (Item item : items) {
            if (item.getItemId().equals(id)) {
                items.remove(item);
                System.out.println("Item removed!");
                return;
            }
        }
        System.out.println("Item not found!");
    }

    // Update quantity
    public void updateQuantity(String id, int quantity) {
        for (Item item : items) {
            if (item.getItemId().equals(id)) {
                item.setQuantity(quantity);
                System.out.println("Quantity updated!");
                return;
            }
        }
        System.out.println("Item not found!");
    }

    // Search item
    public void searchItem(String keyword) {
        for (Item item : items) {
            if (item.getItemId().equals(keyword) || 
                item.getItemName().equalsIgnoreCase(keyword)) {
                System.out.println(item);
                return;
            }
        }
        System.out.println("Item not found!");
    }

    // Display all items
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty!");
            return;
        }

        for (Item item : items) {
            System.out.println(item);
        }
    }
}