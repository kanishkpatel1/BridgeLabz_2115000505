public class q7_volume_of_sphere {
    public static void main(String[] args) {
        
        double pi=3.14;
        int radius=6378;
        double volume=(4/3)*(Math.pow(radius,3));
        System.out.println("The volume of earth in cubic kilometers is "+volume +" and cubic miles is "+volume*1.6);
    }
}
