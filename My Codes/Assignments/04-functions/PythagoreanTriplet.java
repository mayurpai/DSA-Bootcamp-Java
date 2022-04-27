public class PythagoreanTriplet {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 6, 5 };
        int n = arr.length;
        System.out.println(checkPythagoreanTriplet(arr, n));
    }

    static boolean checkPythagoreanTriplet(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr[i] *= arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }

        for (int i = arr.length - 1; i >= 2; i--) {
            int indexOne = 0;
            int indexTwo = i - 1;

            while (indexOne < indexTwo) {
                if ((arr[indexOne] + arr[indexTwo]) == arr[i]) {
                    return true;
                }
                if ((arr[indexOne] + arr[indexTwo]) < arr[i]) {
                    indexOne++;
                } else {
                    indexTwo--;
                }
            }
        }
        return false;
    }

    static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
