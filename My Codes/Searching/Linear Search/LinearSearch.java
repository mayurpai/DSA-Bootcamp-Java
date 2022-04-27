public class LinearSearch {
    public static void main(String[] args) throws Exception {
        int[] arr = { 1, 23, 65, 76, 334, 1123, 11113 };
        int target = 65;
        System.out.println(linearSearch(arr, target));
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}