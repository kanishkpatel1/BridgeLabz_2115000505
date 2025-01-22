public class q4_profit_loss {
    public static void main(String[] args) {
        int cp=129;
        int sp=191;
        int profit=sp-cp;
        double pp=profit*100/(cp);

        System.out.println("The Cost Price is INR "+cp+ " Selling Price in INR "+sp);
        System.out.println("The Profit is INR "+profit+" and the Profit Percentage is "+pp);
    }
}
