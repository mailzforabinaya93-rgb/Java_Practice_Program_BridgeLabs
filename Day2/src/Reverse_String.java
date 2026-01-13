public class Reverse_String {
    public static void main(String[] args) {
        // Write a program to reverse the integer number eg: input n=231 reverse is 132
        int n = 231;
        int rev = 0;
        for (; n != 0; n= n/10) {
            int digit = n % 10;
            rev = (rev * 10) + digit ;
        }
        System.out.println(" The reverse of 231: "+rev);
    }


}
