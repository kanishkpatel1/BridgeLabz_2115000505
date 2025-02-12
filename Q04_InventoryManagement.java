
public class Q04_InventoryManagement {
    class Node {
        String name;
        int id;
        int quantity;
        double price;
        Node next;

        public Node(String name, int id, int quantity, double price) {
            this.name = name;
            this.id = id;
            this.quantity = quantity;
            this.price = price;
            this.next = null;
        }
    }

    private Node head = null;

    public void addItem(int index, String name, int id, int quantity, double price) {
        Node newNode = new Node(name, id, quantity, price);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int count = 0;
        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteItem(int id) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.id == id) {
            head = head.next;
            System.out.println("Item deleted.");
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Item deleted.");
        } else {
            System.out.println("Item not found.");
        }
    }

    public int countItems() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public Node findItem(int id) {
        Node temp = head;
        while (temp != null) {
            if (temp.id == id) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void updateItem(int id, String newName, int newQuantity, double newPrice) {
        Node item = findItem(id);
        if (item != null) {
            item.name = newName;
            item.quantity = newQuantity;
            item.price = newPrice;
            System.out.println("Item updated successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

    public void sortItemsByPrice() {
        if (head == null || head.next == null) {
            return; // No need to sort if 0 or 1 element.
        }

        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            Node prev = null;
            while (current != null && current.next != null) {
                if (current.price > current.next.price) {
                    // Swap nodes
                    if (prev == null) {
                        Node temp = current.next;
                        current.next = temp.next;
                        temp.next = current;
                        head = temp;
                        prev = temp;
                    } else {
                        Node temp = current.next;
                        current.next = temp.next;
                        temp.next = current;
                        prev.next = temp;
                        prev = temp;
                    }
                    swapped = true;
                } else {
                    prev = current;
                    current = current.next;
                }
            }
        } while (swapped);
    }

    public void displayItems() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println("Item: " + temp.name + "  ID: " + temp.id +
                               "  Quantity: " + temp.quantity + " Price: " + temp.price +
                               "  Total Price: " + (temp.quantity * temp.price));
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Q04_InventoryManagement inventory = new Q04_InventoryManagement();

        inventory.addItem(0, "Pen", 1, 10, 10);
        inventory.addItem(1, "Phone", 2, 20, 250000);
        inventory.addItem(2, "Notebook", 3, 50, 100);
        inventory.addItem(3, "Laptop", 4, 5, 80000);
        inventory.addItem(4, "Bottle", 5, 15, 150);
        inventory.sortItemsByPrice();
        inventory.displayItems();
    }
}