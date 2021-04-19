import java.util.Arrays;

/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 09/03/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Problem42TrappingRainWater {

    public static void main(String[] args) {

        int[] arr = {5,4,1,2};

        int left = 0;
        int right = 0;
        int i = 1;
        int water = 0;


        while (i < arr.length) {

            while (i < arr.length && arr[i - 1] <= arr[i]) {
                i++;
            }
            left = i - 1;
            i++;
            while (i < arr.length && arr[i] < arr[left]) {
                i++;
            }
            boolean flag = false;
            if (i == arr.length) {
                flag = true;
                int max = Integer.MIN_VALUE;
                for (int k = left + 1; k < arr.length; k++) {
                    if (arr[k] >= max) {
                        max=arr[k];
                        right = k;
                    }

                }
            }
            if (!flag)
                right = i;

            if (right> arr.length)
                right=arr.length-1;

            for (int j = left + 1; j < right; j++) {
                water += Math.min(arr[left], arr[right]) - arr[j];
            }

        }

        System.out.println(water);

//        int left = 0, right = 1;
//        int i, j;
//
//        int waterAmount = 0;
//
//
//        while (right < arr.length) {
//
//            for (i = right; i < arr.length; i++) {
//                if (arr[i - 1] > arr[i]) {
//                    left = i - 1;
//                    break;
//                }
//            }
//
//
//            for (j = i; j < arr.length; j++) {
//                if (arr[j] > arr[left]) {
//                    right = j;
//                    break;
//                }
//                waterAmount += left - arr[j];
//            }
//        }
//
//        System.out.println(waterAmount);

    }
}
