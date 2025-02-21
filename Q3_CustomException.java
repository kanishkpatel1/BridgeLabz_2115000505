import java.util.*;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }

}
public class Q3_CustomException {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in );
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        try{
            checkAge(age);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void checkAge(int age) throws InvalidAgeException{
        if(age<18 || age>100){
            throw new InvalidAgeException("Age must be greater than 18 to vote");
        }
    }
}
