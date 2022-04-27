import java.util.Scanner;

public class BasicJavaPrograms {
    public static void main(String[] args) {
        System.out.println(areaCircle(5));
        System.out.println(areaTriangle(12, 2));
        System.out.println(areaRectangle(3,4));
        System.out.println(areaIsosceles(5, 2));
        System.out.println(areaParallelogram(8, 5));
        System.out.println(areaRhombus(5, 6));
        System.out.println(areaEquilateralTriangle(9));
        System.out.println(perimeterCircle(2));
        System.out.println(perimeterEquilateralTriangle(7));
        System.out.println(perimeterParallelogram(2, 3));
        System.out.println(perimeterRectangle(9, 5));
        System.out.println(perimeterSquare(8));
        System.out.println(perimeterRhombus(2));
        System.out.println(volumeCone(1, 3));
        System.out.println(volumePrism(2, 4));
        System.out.println(volumeCylinder(6, 2));
        System.out.println(volumeSphere(5));
        System.out.println(volumePyramid(1, 2, 3));
        System.out.println(curvedSurfaceAreaCylinder(4, 2));
        System.out.println(totalSurfaceAreaCube(6));
        fibonacciSeries(10);
        System.out.println(subProductAndSum(234));
        factorOfNumber(50);
        System.out.println(infiniteSum());
        System.out.println(infiniteMax());
        System.out.println(addition(43, 23));
    }

    static double areaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    static double areaTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    static double areaRectangle(double length, double breadth) {
        return length * breadth;
    }

    static double areaIsosceles(double base, double height) {
        return 0.5 * base * height;
    }

    static double areaParallelogram(double base, double height) {
        return base * height;
    }

    static double areaRhombus(double diagonal1, double diagonal2) {
        return 0.5 * diagonal1 * diagonal2;
    }

    static double areaEquilateralTriangle(double side) {
        return ((1.732 / 4) * side * side);
    }

    static double perimeterCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    static double perimeterEquilateralTriangle(double side) {
        return 3 * side;
    }

    static double perimeterParallelogram(double base, double side) {
        return 2 * (base + side);
    }

    static double perimeterRectangle(double length, double width) {
        return 2 * (length + width);
    }

    static double perimeterSquare(double side) {
        return 4 * side;
    }

    static double perimeterRhombus(double side) {
        return 4 * side;
    }

    static double volumeCone(double radius, double height) {
        return Math.PI * radius * radius * (height / 3);
    }

    static double volumePrism(double base, double height) {
        return base * height;
    }

    static double volumeCylinder(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    static double volumeSphere(double radius) {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }

    static double volumePyramid(double length, double width, double height) {
        return length * width * height / 3;
    }

    static double curvedSurfaceAreaCylinder(double radius, double height) {
        return 2 * Math.PI * radius * height;
    }

    static double totalSurfaceAreaCube(double side) {
        return 6 * side * side;
    }

    static void fibonacciSeries(int n) {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    static int subProductAndSum(int n) {
        int answer = 0;
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;
        }
        answer = Math.subtractExact(product, sum);
        return answer;
    }

    static void factorOfNumber(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static int infiniteSum() {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        do {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }
            sum += n;
        } while (true);
        return sum;
    }

    static int infiniteMax() {
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        do {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }
            if (n > max) {
                max = n;
            }
        } while (true);
        return max;
    }

    static int addition(int num1, int num2) {
        return num1 + num2;
    }

}