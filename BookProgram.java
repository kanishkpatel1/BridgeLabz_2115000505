import java.util.*;
class Book{
    String title;
    String author;
    double price;
    Book(){
        this.title = "Java";
        this.author="James Goslin";
        this.price=250;
    }
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;

    }
    void display(){
        System.out.println("Book Name : "+title);
        System.out.println("Book Author: "+author);
        System.out.println("Book Price: "+price);
    }
}
public class BookProgram{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String title=input.nextLine();
        String author=input.nextLine();
        double price=input.nextDouble();

        // default constructor
        Book obj=new Book();
        obj.display();

        // parameterized constructors
        Book obj2=new Book(title,author,price);
        obj2.display();
        
    }
    
}