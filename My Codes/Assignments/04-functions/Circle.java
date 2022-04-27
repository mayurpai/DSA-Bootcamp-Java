import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        System.out.println("Area = " + areaOfCircle(radius));
        System.out.println("Circumference = " + circumferenceOfCircle(radius));
    }

    static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    static double circumferenceOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }
}
