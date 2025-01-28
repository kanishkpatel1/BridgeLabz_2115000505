import java.util.*;
public class q12_TrigonometricFunction {
    public double[] calculateTrigonometricFunctions(double angle){
        double radians=Math.toRadians(angle);
        double[]res=new double[3];
        res[0]=Math.sin(radians);
        res[1]=Math.cos(radians);
        res[2]=Math.tan(radians);
        return res;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        q12_TrigonometricFunction obj=new q12_TrigonometricFunction();
        System.out.println("Enter the value of angle in degrees");
        double angle=sc.nextDouble();
        double trigoFun[]=obj.calculateTrigonometricFunctions(angle);
        System.out.println("Sine value is "+trigoFun[0]+" Cosine value is "+trigoFun[1]+" and tangent values is "+trigoFun[2]);
        sc.close();
    }
}
