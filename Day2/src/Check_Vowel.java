import java.util.Scanner;
public class Check_Vowel {
    public static void main(String[] args) {
        //Write a program to check Vowel or Consonant
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':

                System.out.println("It is a Vowel");
                break;
            default:
                System.out.println("It is a Consonant");
        }

    }

}
