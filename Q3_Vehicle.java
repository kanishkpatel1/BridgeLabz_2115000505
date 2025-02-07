import java.util.*;
class Vehicle{
    int maxSpeed;
    String fuelType;
    Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
    }

    public void displayInfo(){
        System.out.println("speed is "+maxSpeed+" fuel type is "+fuelType);}
    }
class Car extends Vehicle{
    int seatCapacity;
    public Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity=seatCapacity;
    } 
    @Override
    public void displayInfo(){
        System.out.println("speed of car is "+maxSpeed+" fuel type is "+fuelType +" and seat capacity is "+seatCapacity);}   
}
class Truck extends Vehicle{
    int loadCapacity;
    public Truck(int maxSpeed, String fuelType, int loadCapacity){
        super(maxSpeed, fuelType);
        this.loadCapacity=loadCapacity;
    } 
    @Override
    public void displayInfo(){
        System.out.println("speed of car is "+maxSpeed+" fuel type is "+fuelType +" and seat capacity is "+loadCapacity);}  
  }
class Motorcycle extends Vehicle{
    int average;
    public Motorcycle(int maxSpeed, String fuelType, int average){
        super(maxSpeed, fuelType);
        this.average=average;
    } 
    @Override
    public void displayInfo(){
        System.out.println("speed of bike is "+maxSpeed+" fuel type is "+fuelType +" and average of bike is "+average);
}
}

public class Q3_Vehicle {
    public static void main(String[] args) {
        Vehicle vehicle =new Vehicle(10, "Petrol");

        Vehicle[] v=new Vehicle[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
        System.out.println("Enter the type of Vehicle");
        String type=sc.next();
        if(type.equals("Car")){
            System.out.println("Enter the maxSpeed of the car ");
            int speed=sc.nextInt();
            System.out.println("Enter ceat capacity ");
            int seatCapacity=sc.nextInt();
            System.out.println("Enter the fuel type for car ");
            String fueltype=sc.next();
            Car c=new Car(speed, fueltype, seatCapacity);
            v[i]=c;
        }
       else if(type.equals("Truck")){
            System.out.println("Enter the maxSpeed of the truck ");
            int speed=sc.nextInt();
            System.out.println("Enter load capacity ");
            int loadCapacity=sc.nextInt();
            System.out.println("Enter the fuel type for truck ");
            String fueltype=sc.next();
            Truck t=new Truck(speed, fueltype, loadCapacity);
            v[i]=t;
        }

       else if(type.equals("Motorcycle")){
            System.out.println("Enter the maxSpeed of the motorcycle ");
            int speed=sc.nextInt();
            System.out.println("Enter average of Bike ");
            int average=sc.nextInt();
            System.out.println("Enter the fuel type for car ");
            String fueltype=sc.next();
            Motorcycle m=new Motorcycle(speed, fueltype, average);
            v[i]=m;
        }
        else{
            System.out.println("Please enter correct Vehicle type");
        }
        }

        for(Vehicle vc:v){
            vc.displayInfo();
        }
    }
}
