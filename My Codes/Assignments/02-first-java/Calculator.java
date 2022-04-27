import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        char op = in.next().trim().charAt(0);

        if (op == '+') {
            System.out.println(num1 + num2);
        } else if (op == '-') {
            System.out.println(num1 - num2);
        } else if (op == '*') {
            System.out.println(num1 * num2);
        } else if (op == '/') {
            if (num2 != 0) {
                System.out.println(num1 + num2);
            } else {
                System.out.println("Divide By Zero Error!");
            }
        } else {
            System.out.println("Invalid Operator!");
        }
        System.out.println();
    }
}