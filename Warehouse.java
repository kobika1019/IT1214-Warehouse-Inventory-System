import java.util.Scanner;

public class Warehouse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();

        int choice;

        do {

            System.out.println("\n===== Warehouse Inventory Management System =====");

            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Quantity");
            System.out.println("4. Search Item By ID");
            System.out.println("5. Search Item By Name");
            System.out.println("6. Display All Items");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid input. Enter a number: ");
                sc.next();
            }

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Item ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    if (quantity < 0) {
                        System.out.println("Quantity cannot be negative.");
                        break;
                    }

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    if (price < 0) {
                        System.out.println("Price cannot be negative.");
                        break;
                    }

                    Item item = new Item(id, name, quantity, price);

                    inventory.addItem(item);

                    break;

                case 2:

                    System.out.print("Enter Item ID to remove: ");
                    String removeId = sc.nextLine();

                    inventory.removeItem(removeId);

                    break;

                case 3:

                    System.out.print("Enter Item ID: ");
                    String updateId = sc.nextLine();

                    System.out.print("Enter New Quantity: ");
                    int newQuantity = sc.nextInt();

                    inventory.updateQuantity(updateId, newQuantity);

                    break;

                case 4:

                    System.out.print("Enter Item ID: ");
                    String searchId = sc.nextLine();

                    inventory.searchById(searchId);

                    break;

                case 5:

                    System.out.print("Enter Item Name: ");
                    String searchName = sc.nextLine();

                    inventory.searchByName(searchName);

                    break;

                case 6:

                    inventory.displayAllItems();

                    break;

                case 7:

                    System.out.println("Program terminated.");
                    break;

                default:

                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 7);

        sc.close();
    }
} 