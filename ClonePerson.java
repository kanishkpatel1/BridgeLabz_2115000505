import java.util.*;
class Person{
    String name;
    int age;
    String gender;
    Person(){
        this("Ayush",20,"male");
    }
    Person(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;

    }
    Person(Person previousPerson){
        this.name=previousPerson.name;
        this.age=previousPerson.age;
        this.gender=previousPerson.gender;
    }
    void display(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Gender :"+gender);
    }
}
public class ClonePerson {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name of the Person");
        String name=sc.nextLine();
        System.out.println("Enter age of the Person");
        int age=sc.nextInt();
        System.out.println("Enter Gender of the Person");
        sc.nextLine();
        String gender=sc.nextLine();

        Person p=new Person();
        Person p1=new Person(name,age,gender);
        Person p2=new Person(p1);
        Person p3=new Person(p);
        p2.display();
        p3.display();
    }
    
}