public class q6_discout_fee {
    public static void main(String[] args) {
        int fee=125000;
        int discountPercent=10;
        double discout=(fee*discountPercent)/100;
        
        double discountedfee=fee-discout;
        System.out.println("The discount amount is INR "+discout+" and final discounted fee is INR "+discountedfee);
    }
}
