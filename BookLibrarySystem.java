import java.util.Scanner;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book ISBN:");
        String bookISBN = sc.nextLine();

        System.out.println("Enter Book Title:");
        String bookTitle = sc.nextLine();

        System.out.println("Enter Book Author:");
        String bookAuthor = sc.nextLine();

        Book book = new Book(bookISBN, bookTitle, bookAuthor);
        book.displayBookDetails();

        System.out.println("\nEnter new author name:");
        String newAuthor = sc.nextLine();
        book.setAuthor(newAuthor);
        System.out.println("Updated Author: " + book.getAuthor());

        System.out.println("\nEnter EBook ISBN:");
        String eBookISBN = sc.nextLine();

        System.out.println("Enter EBook Title:");
        String eBookTitle = sc.nextLine();

        System.out.println("Enter EBook Author:");
        String eBookAuthor = sc.nextLine();

        EBook eBook = new EBook(eBookISBN, eBookTitle, eBookAuthor);
        eBook.displayEBookDetails();

        sc.close();
    }
}
