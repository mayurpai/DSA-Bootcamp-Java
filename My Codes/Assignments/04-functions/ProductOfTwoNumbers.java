import java.util.Scanner;

public class ProductOfTwoNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(productOfTwoNumbers(num1, num2));
    }

    static int productOfTwoNumbers(int num1, int num2) {
        return num1 * num2;
    }
}
