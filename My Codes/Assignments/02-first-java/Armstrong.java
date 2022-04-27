import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(armStrong(n));
    }

    static boolean armStrong(int n) {
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int remainder = n % 10;
            sum += remainder * remainder * remainder;
            n /= 10;
        }
        if (temp == sum) {
            return true;
        }
        return false;
    }
}
