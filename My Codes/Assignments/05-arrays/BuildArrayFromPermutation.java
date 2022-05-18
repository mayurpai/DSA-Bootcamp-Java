import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 5, 3, 4 };
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr[i]];
        }
        System.out.println(Arrays.toString(ans));
    }
}
