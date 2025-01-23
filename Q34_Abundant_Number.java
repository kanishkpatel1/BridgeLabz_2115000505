public class Q34_Abundant_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        if (sum > n) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not a Abundant number");
        }

    }
}
