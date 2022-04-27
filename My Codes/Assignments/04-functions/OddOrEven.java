import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        oddOrEvenChecker(n);
    }

    static void oddOrEvenChecker(int n) {
        if ((n & 1) == 1) {
            System.out.println(n + " Is Odd!");
        } else {
            System.out.println(n + " Is Even!");
        }
    }
}
