import java.util.Scanner;
public class q11_windChillTemp {
    public double calculateWindChill(double temperature, double windSpeed){
        // double windChill=35.74+0.6215*temperature+(0.4275*temperature-35.75)*(Math.pow(windSpeed,0.16));
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);

        return windChill;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature");
        double temp=sc.nextDouble();
        System.out.println("Enter the windSpeed");
        double windSpeed=sc.nextDouble();
        q11_windChillTemp obj=new q11_windChillTemp();
        double windChill=obj.calculateWindChill(temp,windSpeed);
        System.out.println("WindChill Temperature is "+windChill);
        sc.close();
    }
    
}
