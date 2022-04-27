import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(palindromeChecker(n));
    }

    static boolean palindromeChecker(int n) {
        int temp = n;
        int reversedNumber = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            reversedNumber = rem + reversedNumber * 10;
        }
        if (reversedNumber == temp) {
            return true;
        }
        return false;
    }
}
