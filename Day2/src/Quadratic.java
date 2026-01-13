import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
		/*Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
		Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula delta = b*b - 4*a*c
		Root 1 of x = (-b + sqrt(delta))/(2*a)
		Root 2 of x = (-b - sqrt(delta))/(2*a)*/
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Not a quadratic equation (a cannot be 0)");
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Two distinct real roots:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);

        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("Two equal real roots:");
            System.out.println("Root = " + root);

        } else {
            System.out.println("No real roots (delta is negative)");
        }

    }

}
