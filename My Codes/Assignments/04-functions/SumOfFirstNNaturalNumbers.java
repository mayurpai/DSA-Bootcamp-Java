import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sumOfFirstNNaturalNumbers(n));
    }

    static int sumOfFirstNNaturalNumbers(int n) {
        return (n * (n + 1)) / 2;
    }
}