import java.util.*;
public class Q21_Rocket_Launch_forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the countdown start value: ");
        int counter = sc.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Launch");
    }
}
