import java.util.Scanner;

public class GradeOfStudent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalMarks = 0;

        System.out.print("Enter The Number Of Subjects: ");
        int count = in.nextInt();

        for (int i = 0; i < count; i++) {
            totalMarks += in.nextInt();
        }
        float overall = (totalMarks / count);
        if (overall >= 91 && overall <= 100) {
            System.out.println("Grade: AA");
        } else if (overall >= 81 && overall <= 90) {
            System.out.println("Grade: AB");
        } else if (overall >= 71 && overall <= 80) {
            System.out.println("Grade: BB");
        } else if (overall >= 61 && overall <= 70) {
            System.out.println("Grade: BC");
        } else if (overall >= 51 && overall <= 60) {
            System.out.println("Grade: CD");
        } else if (overall >= 41 && overall <= 50) {
            System.out.println("Grade: DD");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}