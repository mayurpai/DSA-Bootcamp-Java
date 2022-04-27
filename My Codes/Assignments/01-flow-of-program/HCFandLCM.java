import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        calcHCFAndLCM(num1, num2);
    }

    static void calcHCFAndLCM(int num1, int num2) {
        int highestCommonFactor, lowestCommonMultiple;
        int temp1 = num1;
        int temp2 = num2;

        while (temp2 != 0) {
            int temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }

        highestCommonFactor = temp1;
        lowestCommonMultiple = (num1 * num2) / highestCommonFactor;
        System.out.println("Highest Common Factor = " + highestCommonFactor);
        System.out.println("Lowest Common Multiple = " + lowestCommonMultiple);
    }
}
