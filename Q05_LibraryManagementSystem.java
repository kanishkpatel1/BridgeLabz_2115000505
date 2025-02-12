import java.util.*;

public class Q05_LibraryManagementSystem {
    class Book {
        String bookTitle;
        String author;
        String genre;
        int bookId;
        boolean isAvailable;
        Book next;
        Book prev;

        Book(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
            this.bookTitle = bookTitle;
            this.author = author;
            this.genre = genre;
            this.bookId = bookId;
            this.isAvailable = isAvailable;
            this.next = null;
            this.prev = null;
        }
    }

    private Book head;
    private Book tail;

    // Add a book at the beginning
    public void addFirst(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        Book newNode = new Book(bookTitle, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add a book at the end
    public void addLast(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        Book newNode = new Book(bookTitle, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add a book at a specific position
    public void addSpecificIndex(int index, String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        if (index == 0) {
            addFirst(bookTitle, author, genre, bookId, isAvailable);
            return;
        }

        Book newNode = new Book(bookTitle, author, genre, bookId, isAvailable);
        Book temp = head;
        int i = 0;

        while (temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Invalid index");
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;

        if (temp == tail) {
            tail = newNode;
        }
    }

    // Remove a book by ID
    public void removeBook(int bookId) {
        if (head == null) {
            System.out.println("Library is empty!");
            return;
        }

        Book temp = head;

        while (temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book Not Found!");
            return;
        }

        if (temp == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        System.out.println("Book with ID " + bookId + " removed successfully.");
    }

    // Search for a book by title or author
    public void searchBook(String title, String author) {
        Book temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.bookTitle.equalsIgnoreCase(title) || temp.author.equalsIgnoreCase(author)) {
                System.out.println("Book Found: " + temp.bookTitle + " by " + temp.author);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No book found with the given Title or Author.");
        }
    }

    // Update book availability status
    public void updateBookStatus(int bookId, boolean isAvailable) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = isAvailable;
                System.out.println("Book availability updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book Not Found!");
    }

    // Display books in forward order
    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        Book temp = head;
        while (temp != null) {
            System.out.println(temp.bookId + " - " + temp.bookTitle + " by " + temp.author + " [" + (temp.isAvailable ? "Available" : "Not Available") + "]");
            temp = temp.next;
        }
    }

    // Display books in reverse order
    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty.");
            return;
        }

        Book temp = tail;
        while (temp != null) {
            System.out.println(temp.bookId + " - " + temp.bookTitle + " by " + temp.author + " [" + (temp.isAvailable ? "Available" : "Not Available") + "]");
            temp = temp.prev;
        }
    }

    // Count total number of books in the library
    public int countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Q05_LibraryManagementSystem library = new Q05_LibraryManagementSystem();

        // Adding books
        library.addFirst("The Hobbit", "J.R.R. Tolkien", "Fantasy", 1, true);
        library.addLast("Harry Potter", "J.K. Rowling", "Fantasy", 2, true);
        library.addSpecificIndex(1, "1984", "George Orwell", "Dystopian", 3, false);

        // Display books
        System.out.println("Books in Forward Order:");
        library.displayForward();

        System.out.println("\nBooks in Reverse Order:");
        library.displayReverse();

        // Search books
        System.out.println("\nSearching for '1984' by George Orwell:");
        library.searchBook("1984", "George Orwell");

        // Update book availability
        System.out.println("\nUpdating book availability:");
        library.updateBookStatus(3, true);
        library.displayForward();

        // Remove a book
        System.out.println("\nRemoving Book ID 2:");
        library.removeBook(2);
        library.displayForward();

        // Count books
        System.out.println("\nTotal Books in Library: " + library.countBooks());
    }
}
