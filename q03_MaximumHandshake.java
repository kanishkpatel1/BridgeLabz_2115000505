import java.util.Scanner;
public class q03_MaximumHandshake {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Students");
        int n=sc.nextInt();
        double maxHand=(n*(n-1))/2;
        System.out.println("number of possible handshakes : "+maxHand);
        sc.close();

    }
    
}
