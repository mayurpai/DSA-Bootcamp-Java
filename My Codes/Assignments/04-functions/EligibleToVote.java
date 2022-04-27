import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageInYears = sc.nextInt();
        if (ageInYears >= 18) {
            System.out.println("You Are Eligible!");
        } else {
            System.out.println("You Are Not Eligible!");
        }
    }
}