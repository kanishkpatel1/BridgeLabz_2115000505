import java.util.*;
class Book{
    String title;
    String author;
    final int isbn;
    static String  libraryName;
    Book(String title,String author,int isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;

    }

    static void  displayLibraryName(){
        System.out.println("Library Name "+libraryName);
    }
}
public class Q02_LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Library Name");
        Book.libraryName=sc.nextLine();

        System.out.println("Enter the title of Book");
        String title=sc.nextLine();
        System.out.println("Enter the author name");
        String author=sc.nextLine();
        System.out.println("Enter the isbn number");
        int isbn=sc.nextInt();

        Book book=new Book(title, author, isbn);
        Book.displayLibraryName();

        if(book instanceof Book){
            System.out.println("\nBook Details are as:");
            System.out.println("Title: "+book.title);
            System.out.println("Author: "+book.author);
            System.out.println("ISBN: "+book.isbn);
        }
        sc.close();

    }
    
}
