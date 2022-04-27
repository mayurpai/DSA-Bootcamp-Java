public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        patternOne(n);
        System.out.println();
        patternTwo(n);
        System.out.println();
        patternThree(n);
        System.out.println();
        patternFour(n);
        System.out.println();
        patternFive(n);
        System.out.println();
        patternSix(n);
        System.out.println();
        patternSeven(n);
        System.out.println();
        patternEight(n);
        System.out.println();
        patternNine(n);
        System.out.println();
        patternTen(n);
        System.out.println();
        patternEleven(n);
        System.out.println();
        patternThirtyOne(n);
    }

    static void patternOne(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patternTwo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patternThree(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patternFour(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void patternFive(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int numberOfCols = i <= n ? i : 2 * n - i;
            for (int j = 1; j <= numberOfCols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patternSix(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patternSeven(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patternEight(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= k; j++) {
                System.out.print("* ");
            }
            k += 2;
            System.out.println();
        }
    }

    static void patternNine(int n) {
        int k = 2 * n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= k; j++) {
                System.out.print("* ");
            }
            k -= 2;
            System.out.println();
        }
    }

    static void patternTen(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patternEleven(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patternThirtyOne(int n) {
        int originalN = n;
        n = 2 * n;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= n - 1; j++) {
                int index = originalN - Math.min(Math.min(i, j), Math.min(n - i, n - j)) + 1;
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }
}