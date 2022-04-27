import java.util.Scanner;

public class InfiniteSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n;
        do {
            n = in.nextInt();
            sum += n;
        } while (in.hasNextInt());
        System.out.println(sum);
    }
}
