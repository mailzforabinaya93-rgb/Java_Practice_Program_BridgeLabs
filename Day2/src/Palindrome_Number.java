import java.util.Scanner;
public class Palindrome_Number {
    public static void main(String[] args) {
        // Write a program to find a Palindrome Number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int rev = 0;
        int original = num;//save the original number
        for (; num != 0; num = num / 10) {
            int digit = num % 10;
            rev = (rev * 10) + digit;
        }
        if (original == rev) {
            System.out.println("It is a Palindrome Number ");
        } else {
            System.out.println("It is not a Palindrome Number");
        }
    }
    }
