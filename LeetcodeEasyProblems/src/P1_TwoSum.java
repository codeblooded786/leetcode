import java.util.HashMap;
import java.util.Map;

/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 03/12/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class P1_TwoSum {

    public int[] twoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No valid answer");
    }

    public int[] twoSum2(int arr[], int target) {
        Map<Integer, Integer> matrix = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            matrix.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (matrix.containsKey(complement)) {
                return new int[]{i, matrix.get(complement)};
            }
        }
        throw new IllegalArgumentException("No answer");
    }

    public int[] twoSum3(int arr[], int target) {
        Map<Integer, Integer> matrix = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (matrix.containsKey(complement)) {
                return new int[]{i, matrix.get(complement)};
            }
            matrix.put(arr[i], i);
        }
        throw new IllegalArgumentException("No answer");
    }


    public static void main(String[] args) {

        int arr[] = {3, 2, 4};
        P1_TwoSum p1TwoSum = new P1_TwoSum();
        int[] twoSum = p1TwoSum.twoSum3(arr, 6);
        System.out.println(twoSum[0] + ", " + twoSum[1]);
    }
}
