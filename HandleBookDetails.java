import java.util.*;
class Book{
    String title,author;
    double price;
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void bookDetails(){
        System.out.println("Title of Book is "+title);
        System.err.println("Author of Book is "+author);
        System.err.println("Price of Book is "+price);
    }
}
public class HandleBookDetails {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter title of the book");    
        String title=input.nextLine();
        System.out.println("Enter book author name");
        String author=input.nextLine();
        System.out.println("Enter the price of book");
        double price=input.nextDouble();
        Book book=new Book(title,author,price);
        book.bookDetails();
    }
    
}
