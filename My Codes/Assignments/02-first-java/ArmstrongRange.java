import java.util.Scanner;

public class ArmstrongRange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startRange = in.nextInt();
        int endRange = in.nextInt();
        for (int i = startRange; i <= endRange; i++) {
            if (armStrong(i)) {
                System.out.println(i + " ");
            }
        }
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
