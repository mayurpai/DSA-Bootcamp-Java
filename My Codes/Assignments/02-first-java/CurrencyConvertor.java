import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double indianCurrency = in.nextInt();
        double usDollar = 76.48;
        System.out.println(indianCurrency / usDollar);
    }
}
