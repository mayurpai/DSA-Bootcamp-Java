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
        // patternThirteen(n);
        // System.out.println();
        // patternFourteen(n);
        // System.out.println();
        patternFifteen(n);
        System.out.println();
        // patternSixteen(n);
        // System.out.println();
        // patternTwenty(n);
        // System.out.println();
        // patternTwentyOne(n);
        // System.out.println();
        // patternTwentyTwo(n);
        // System.out.println();
        // patternTwentySix(n);
        // System.out.println();
        // patternThirty(n);
        // System.out.println();
        // patternThirtyOne(n);
        // System.out.println();
        // patternThirtyTwo(n);
        // System.out.println();
        // patternThirtyThree(n);
        // System.out.println();
        // patternThirtyFour(n);
        // System.out.println();
        // patternThirtyFive(n);
        // System.out.println();
        // patternThirtySix(n);
        // System.out.println();
        // patternThirtySeven(n);
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

    static void patternThirteen(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= k; j++) {
                if (j == 1 || i == n || j == k) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            k += 2;
            System.out.println();
        }
    }

    // Not Done
    static void patternFourteen(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= (n - i) * 2 + 1; j++) {
                if (i == 1 || j == 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void patternFifteen(int n) {
        int k = 1;
        int l = 2 * n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= k; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= l; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            k += 2;
            l -= 2;
            System.out.println();
        }
    }

    static int factorial(int n) {
        if (n < 2) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static void patternSixteen(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(factorial(i) / (factorial(i - j) * factorial(j)) + "   ");
            }
            System.out.println();
        }
    }

    static void patternTwenty(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n - 1 || j == 0) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    static void patternTwentyOne(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    static void patternTwentyTwo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    static void patternTwentySix(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void patternThirty(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
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

    static void patternThirtyTwo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + n - i + j) + " ");
            }
            System.out.println();
        }
    }

    static void patternThirtyThree(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((count & 1) != 1) {
                    System.out.print((char) (64 + count) + " ");
                } else {
                    System.out.print((char) (96 + count) + " ");
                }
                count++;
            }
            System.out.println();
        }
    }

    static void patternThirtyFour(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print((char) (65 - i + j) + " ");
            }
            System.out.println();
        }
    }

    static void patternThirtyFive(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            int numOfSpaces = n - i;
            for (int j = 1; j <= numOfSpaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= numOfSpaces; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void patternThirtySix(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print((char) (63 + i + j) + " ");
            }
            System.out.println();
        }
    }

    static void patternThirtSeven(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}