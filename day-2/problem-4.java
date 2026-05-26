import java.util.Arrays;

public class MoveZeroRight {
    public static void main(String[] args) {

        int arr[] = {1, 0, -3, 0, 5, -2, 0, 8, 0, 4};

        int result[] = new int[arr.length];
        int index = 0;

        // Store all non-zero elements first
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[index] = arr[i];
                index++;
            }
        }

        // Remaining positions automatically contain 0

        System.out.println(Arrays.toString(result));
    }
}
