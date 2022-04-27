import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rangeNum1 = in.nextInt();
        int rangeNum2 = in.nextInt();
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = rangeNum1; i <= rangeNum2; i++) {
            if (primeChecker(i)) {
                primeNumbers.add(i);
            }
        }
        System.out.println(primeNumbers);
    }

    static boolean primeChecker(int n) {
        if (n == 1) {
            return false;
        }
        int i = 2;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}