public class FindLength {
    public static void main(String[] args) {
        int num = 123456;
        System.out.print(findLength(num));
    }

    static int findLength(int num) {
        return (int) Math.log10(num) + 1;
    }
}
