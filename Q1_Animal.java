class Animal{
int age;
String name;
public void makeSound(){
    System.out.println("Animal name is "+name+" and age is "+age);
}
    Animal(int age, String name){
        this.age=age;
        this.name=name;
    }
}
class Dog extends Animal{
    Dog(int age, String name){
        super(age, name);
    }
    @Override
  public void makeSound(){
    super.makeSound();
    System.out.println("Dog Barks");
  }
}

class Cat extends Animal{
    Cat(int age, String name){
        super(age, name);
    }
    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println(" mews");
      }
}

class Bird extends Animal{
    Bird(int age, String name){
        super(age, name);
    }
    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Bird Chirps");
      }
}
public class Q1_Animal{
    public static void main(String[] args) {
        Animal animal=new Animal(26,"animal");
        animal.makeSound();

        Animal dog=new Dog(5,"tommy");
        dog.makeSound();

        Animal cat=new Cat(2,"anny");
        cat.makeSound();

        Animal bird=new Bird(1,"titu");
        bird.makeSound();
    }
}