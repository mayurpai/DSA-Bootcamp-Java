public class SetMisMatch {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4 };
        System.out.println(setMisMatch(arr));
    }

    static int[] setMisMatch(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return new int[] { arr[j], j + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

    static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
