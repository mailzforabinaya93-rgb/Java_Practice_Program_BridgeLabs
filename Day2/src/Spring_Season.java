import java.util.Scanner;
public class Spring_Season {
    public static void main(String[] args) {
	/*Write a program SpringSeason.java that takes two int values m and d from the command line and
	  prints true if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise.
	 */
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();

        System.out.print("Enter day: ");
        int d = sc.nextInt();

        boolean isSpring =
                (m == 3 && d >= 20) ||
                        (m == 4) ||
                        (m == 5) ||
                        (m == 6 && d <= 20);

        System.out.println(isSpring);
    }

}





