import java.util.Scanner;

public class IntermediateJavaPrograms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(factorial(5));
        System.out.println(electricityBill(380));
        System.out.println(average(5));
        System.out.println(discount(100, 5));
        System.out.println(distance(5, 4));
        System.out.println(commissionPercentage(1000, 15));
        System.out.println(power(5, 3));
        System.out.println(depreciationValue(100000, 10, 3));
        System.out.println(battingAverage(12, 143));
        System.out.println(CGPACalculator(5));
        System.out.println(compoundInterest(1000, 3, 5, 1));
        System.out.println(averageMarks(5));
        System.out.println(sum(10));
        System.out.println(armStrongNumber(153));
        System.out.println(nCr(5, 3));
        System.out.println(nPr(5, 2));
        System.out.println(stringReverse("Mayur"));
        System.out.println(palindrome(1221));
        System.out.println(futureInvestmentValue(1000, 10, 2));
        System.out.println(highestCommonFactor(5, 45));
        System.out.println(lowestCommonMultiple(5, 45));
        vowelConsonantChecker('a');
        System.out.println(perfectNumber(496));
        System.out.println(checkLeapYear(2016));
        System.out.println(sumOfDigits(159));
        System.out.println(countDays(8));
        sumForAll();
    }

    static int factorial(int n) {
        if (n <= 0) {
            return 0;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static double electricityBill(int units) {
        double billToPay = 0;
        if (units < 100) {
            billToPay = units * 1.20;
        } else if (units < 300) {
            billToPay = 100 * 1.20 + (units - 100) * 2;
        } else if (units > 300) {
            billToPay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
        }
        return billToPay;
    }

    static int average(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return (sum / n);
    }

    static int discount(int price, int percentage) {
        return price * percentage / 100;
    }

    static int distance(int p1, int p2) {
        return (int) Math.sqrt(((p1 * p1) + (p2 * p2)));
    }

    static double commissionPercentage(double amount, double commissionPercentage) {
        return (commissionPercentage / 100) * amount;
    }

    static double power(int n, int pow) {
        double result = 1;
        for (int i = 0; i < pow; i++) {
            result *= n;
        }
        return result;
    }

    static double depreciationValue(long amount, long deppercent, long year) {
        long temp = amount;
        for (int i = 0; i < year; i++) {
            temp = ((100 - deppercent) * temp) / 100;
        }
        return temp;
    }

    static double battingAverage(int innings, int score) {
        return (double) score / innings;
    }

    static double CGPACalculator(int numberOfSubjects) {
        Scanner in = new Scanner(System.in);
        double CGPA = 0;
        for (int i = 0; i < numberOfSubjects; i++) {
            CGPA += in.nextDouble();
        }
        return (double) CGPA / numberOfSubjects;
    }

    static double compoundInterest(double p, double t, double r, int n) {
        return p * Math.pow((1 + (r / n)), n * t);
    }

    static double averageMarks(int numberOfSubjects) {
        Scanner in = new Scanner(System.in);
        double marks = 0;
        for (int i = 0; i < numberOfSubjects; i++) {
            marks += in.nextDouble();
        }
        return (double) marks / numberOfSubjects;
    }

    static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    static boolean armStrongNumber(int n) {
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            sum += rem * rem * rem;
        }
        if (sum == temp) {
            return true;
        }
        return false;
    }

    static int nCr(int n, int r) {
        return (factorial(n) / (factorial(n - r) * factorial(r)));
    }

    static int nPr(int n, int r) {
        return (factorial(n) / factorial(n - r));
    }

    static String stringReverse(String str) {
        String reversedString = "";
        str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        return reversedString;
    }

    static boolean palindrome(int n) {
        int temp = n;
        int num = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            num = rem + num * 10;
        }
        if (num == temp) {
            return true;
        }
        return false;
    }

    static double futureInvestmentValue(double presentValue, double rate, double years) {
        return presentValue * Math.pow((1 + rate / 100), years);
    }

    static double highestCommonFactor(int num1, int num2) {
        int temp1 = num1;
        int temp2 = num2;

        while (temp2 != 0) {
            int temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }
        return temp1;
    }

    static double lowestCommonMultiple(int num1, int num2) {
        int temp1 = num1;
        int temp2 = num2;

        while (temp2 != 0) {
            int temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }
        return (num1 * num2) / temp1;
    }

    static void vowelConsonantChecker(char a) {
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }

    static boolean perfectNumber(int n) {
        int temp = n;
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == temp) {
            return true;
        }
        return false;
    }

    static boolean checkLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            sum += rem;
        }
        return sum;
    }

    static int countDays(int monthNumber) {
        int numofDays;
        switch (monthNumber) {
            case 4:
            case 6:
            case 9:
            case 11:
                numofDays = 30;
                return numofDays / 2;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numofDays = 31;
                return numofDays / 2;

            case 2:
                numofDays = 28;
                return numofDays / 2;

            default:
                System.out.println("Invalid Month!");
                return -1;
        }
    }

    static void sumForAll() {
        Scanner in = new Scanner(System.in);
        int sumOfNegatives = 0;
        int sumOfPositiveEvens = 0;
        int sumOfPositiveOdds = 0;
        while (true) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }
            if (n < 0) {
                sumOfNegatives += n;
            } else if (n % 2 == 0) {
                sumOfPositiveEvens += n;
            } else {
                sumOfPositiveOdds += n;
            }
        }
        System.out.println(sumOfNegatives + " " + sumOfPositiveEvens + " " + sumOfPositiveOdds);
    }
}
