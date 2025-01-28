import java.util.Scanner;

public class Quadratic {

    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        double[] roots = new double[0];

        if (delta > 0) {
            roots = new double[2];
            roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
        } else if (delta == 0) {
            roots = new double[1];
            roots[0] = -b / (2 * a);
        }

        return roots;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 2) {
            System.out.println("The roots of the equation are: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("The root of the equation is: " + roots[0]);
        } else {
            System.out.println("No real roots exist for the given equation.");
        }

        scanner.close();
    }
}
