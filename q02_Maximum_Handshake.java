import java.util.Scanner;
public class q02_Maximum_Handshake {

    public static void MaximumHandShake(int n){
        double maxHand=(n*(n-1))/2;
        System.out.println("The number of possible handshakes : "+maxHand);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        MaximumHandShake(n);
        sc.close();


    }
    
}
