import java.util.*;
class Circle{
     double radius;
    Circle(){
        this(3);        // constructor chaining
    }
    Circle(double radius){
        this.radius=radius;
    }
    double calculateCircle(){
        double area=3.14 * (radius * radius);
        return area;  
    }

    void display(){
        System.out.println("Area of circle is : "+String.format("%.2f",calculateCircle()));
    }
}
public class CircleProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // default constructor
        System.out.println("======= Default Consturctor ===========");
        Circle obj=new Circle();
        obj.display();
        
        // parametrized constructor
        System.out.println("======= Parametrized Consturctor ===========");

        System.out.println("Enter the radius of the circle");
        double radius=sc.nextDouble();
        Circle obj2=new Circle(radius);
        obj2.display();

    }
    
}
