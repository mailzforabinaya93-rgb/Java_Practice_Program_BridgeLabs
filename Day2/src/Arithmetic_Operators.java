import java.util.*;
public class Arithmetic_Operators {
public static void main(String[] args){
    /*1. Enter two numbers and do the following arithmetic Operations find max and min.
		i) a+b*c ii) c+a/b
		iii) a%b+c iV) a*b+c
		*/
Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int a = sc.nextInt();
		System.out.println("Enter the Second number: ");
		int b = sc.nextInt();
		//Max & Min
		if(a>b) {
			System.out.println("Maximum ="+a);
			System.out.println("Minimum ="+b);
		}
		else {
			System.out.println("Maximum ="+b);
			System.out.println("Minimum ="+a);
		}
		//Arithmetic Operations
		System.out.println("Enter the value of c: ");
        int c = sc.nextInt();

        System.out.println("a+b*c = "+ (a+b*c ));
        System.out.println("c+a/b = "+ (c+a/b));
        System.out.println("a%b+c = "+ (a%b+c));
        System.out.println("a*b+c = "+ (a*b+c));

}
}
