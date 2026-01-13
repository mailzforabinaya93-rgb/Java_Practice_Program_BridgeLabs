import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {

        /*java operators => Symbols that performs operations on variables and values
         * Types of Operators
         * 1)Arithmetic Operators
         * 2)Logical Operators
         * 3)Relational operators
         * 4)Assignment operators
         * 5)Unary Operators
         * 6)Bitwise Operators
         * 7)Ternary Operators
         * 8)TypeCast Operators
         * 9)Instance of Operators
         * 10)special operators
         */

        //arithmetic Operators
        int a= 20;
        int b= 4;
        System.out.println(a+b);//24
        System.out.println(a-b);//16
        System.out.println(a*b);//80
        System.out.println(a/b);//5
        System.out.println(a%b);//(remainder) 0

        //Logical Operators
        /*
         * && -- AND
         * || -- OR
         * ! -- NOT
         *
         *
         */

//		System.out.println(15==15);
//		Scanner sc = new Scanner(System.in);
//		String a1="abc";
//		System.out.println("Enter the Value of b1: ");
//		String b1=sc.nextLine();
//		if(a1.equals(b1)) {
//			System.out.println(true);
//		}
//		else {
//			System.out.println(false);
//		}


        //Logical operators
		/*System.out.println((10>9)&&(11<9));//both condition true
		System.out.println((10>9)||(11<9));// any one condition true
		System.out.println(!(10>9)&&(11<9));

		int a=10;
		int b=5;
		System.out.println(a&b);//AND
		System.out.println(a|b);//OR
		System.out.println(a^b);//XOR
		System.out.println(~a);//not
		System.out.println(~b);
		/*

        10/2 =5 =>0
		5/2 =2 =>1
        2/2 =1 =>0

		10 = 1010
         5= 101

		*/

        // Compare 3 numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int A =sc.nextInt();
        System.out.println("Enter the value of B: ");
        int B=sc.nextInt();
        System.out.println("Enter the value of C: ");
        int C= sc.nextInt();
        if(A>B) {
            if(A>C) {
                System.out.println("A is Big");
            }else {
                System.out.println("C is Big ");

            }
        }else if(B>C) {
            System.out.println("B is big");
        }

    }

}
