
import java.util.Scanner;

public class Q8_Find_Yongest_and_Tallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        int age1, age2, age3;
        double height1, height2, height3;

        
        System.out.print("Enter the age of Friend 1: ");
        age1 = sc.nextInt();
        System.out.print("Enter the height of Friend 1 (in meters): ");
        height1 = sc.nextDouble();

        System.out.print("Enter the age of Friend 2: ");
        age2 = sc.nextInt();
        System.out.print("Enter the height of Friend 2 (in meters): ");
        height2 = sc.nextDouble();

        System.out.print("Enter the age of Friend 3: ");
        age3 = sc.nextInt();
        System.out.print("Enter the height of Friend 3 (in meters): ");
        height3 = sc.nextDouble();

        int youngestAge = Math.min(age1, Math.min(age2, age3));
        String youngestFriend = "";
        if (youngestAge == age1) {
            youngestFriend = "Friend 1";
        } else if (youngestAge == age2) {
            youngestFriend = "Friend 2";
        } else {
            youngestFriend = "Friend 3";
        }

        double tallestHeight = Math.max(height1, Math.max(height2, height3));
        String tallestFriend = "";
        if (tallestHeight == height1) {
            tallestFriend = "Friend 1";
        } else if (tallestHeight == height2) {
            tallestFriend = "Friend 2";
        } else {
            tallestFriend = "Friend 3";
        }

        System.out.println("The youngest friend is: " + youngestFriend + " (Age: " + youngestAge + ")");
        System.out.println("The tallest friend is: " + tallestFriend + " (Height: " + tallestHeight + " meters)");
        
        
    }
}
