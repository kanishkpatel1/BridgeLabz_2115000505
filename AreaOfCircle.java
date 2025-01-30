import java.util.*;
class Circle{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    public void areaCircle(double radius){
        double area=3.14*radius*radius;
        System.out.println("Area of circle is "+String.format("%.2f",area));
    }
    public void circumferenceCircle(double radius){
        double circumference=2*3.14*radius;
        System.out.println("Circumference of circle is "+String.format("%.2f",circumference));
    }
}
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double radius=input.nextDouble();
        Circle obj=new Circle(radius);
        obj.areaCircle(radius);
        obj.circumferenceCircle(radius);

    }
    
}
