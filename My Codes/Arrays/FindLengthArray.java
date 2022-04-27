public class FindLengthArray {
    public static void main(String[] args) {
        int[] num = { 12, 342323, 1, 563, 6565 };
        findLengthArray(num);
    }

    static void findLengthArray(int[] num) {
        for (int i : num) {
            System.out.println((int) Math.log10(i) + 1);
        }
    }
}
