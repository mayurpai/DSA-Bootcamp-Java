import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double principal = in.nextDouble();
        double time = in.nextDouble();
        double rate = in.nextDouble();
        double simpleInterest = (principal * time * rate) / 100;
        System.out.println(simpleInterest);
    }
}
