import java.util.Scanner;

class LibraryBooking {
    String title, author;
    double price;
    boolean availability;

    // Default Constructor
    LibraryBooking() {
        this("Java Programming", "James Gosling", 499.99, true);
    }

    // Parameterized Constructor
    LibraryBooking(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Copy Constructor
    LibraryBooking(LibraryBooking previousBooking) {
        this.title = previousBooking.title;
        this.author = previousBooking.author;
        this.price = previousBooking.price;
        this.availability = previousBooking.availability;
    }

    // Method to Borrow a Book
    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("The book \"" + title + "\" has been borrowed successfully.");
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is already borrowed.");
        }
    }

    // Display Book Details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + String.format("%.2f", price));
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }
}

// Main Class
public class LibraryBookSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter Book Title:");
        String title = sc.nextLine();
        System.out.println("Enter Author Name:");
        String author = sc.nextLine();
        System.out.println("Enter Book Price:");
        double price = sc.nextDouble();
        System.out.println("Is the book available? (true/false):");
        boolean availability = sc.nextBoolean();

        // Creating book objects
        LibraryBooking lb1 = new LibraryBooking(); // Default constructor
        LibraryBooking lb2 = new LibraryBooking(title, author, price, availability); // Parameterized constructor
        LibraryBooking lb3 = new LibraryBooking(lb2); // Copy constructor

        // Displaying book details
        System.out.println("\n===== Default Book Details =====");
        lb1.display();
        
        System.out.println("\n===== User-Entered Book Details =====");
        lb2.display();

        System.out.println("\n===== Copy of User-Entered Book Details =====");
        lb3.display();

        // Borrowing book
        System.out.println("\nTrying to borrow the book...");
        lb2.borrowBook();
        lb2.display();
        
        sc.close();
    }
}
