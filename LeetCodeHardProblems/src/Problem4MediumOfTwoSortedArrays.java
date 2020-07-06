import java.util.Arrays;

/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 06/07/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Problem4MediumOfTwoSortedArrays {

    public static double findMedianSortedArrays(int arr[], int brr[]) {
        //double result;
        int lengthArr = arr.length;
        int lengthBrr = brr.length;
        int i = 0, j = 0, k = 0;
        int crr[] = new int[lengthArr + lengthBrr];

        while (true) {
            if (i == lengthArr || j == lengthBrr || k - 1 == (lengthArr + lengthBrr) / 2)
                break;

            if (arr[i] <= brr[j])
                crr[k++] = arr[i++];
            else
                crr[k++] = brr[j++];
        }

        if (j == lengthBrr && k - 1 != (lengthArr + lengthBrr) / 2) {
            int l = i;
            while (true) {
                crr[k++] = arr[l++];
                if (l==lengthArr || k - 1 == (lengthArr + lengthBrr) / 2)
                    break;
            }

        } else if (i == lengthArr && k - 1 != (lengthArr + lengthBrr) / 2) {
            int l = j;
            while (true) {
                crr[k++] = brr[l++];
                if (l == lengthBrr || k - 1 == (lengthArr + lengthBrr) / 2)
                    break;
            }
        }

        return (lengthArr + lengthBrr) % 2 != 0 ? crr[(lengthArr + lengthBrr) / 2] : (crr[(lengthArr + lengthBrr) / 2] + crr[((lengthArr + lengthBrr) / 2) - 1]) / 2.0;
    }


    public static void main(String args[]) {

        /*int arr[] = {38, 26, 15, 12, 1};
        int brr[] = {45, 30, 17, 13, 2};*/


        int arr[] = {2, 3, 5, 8};
        int brr[] = {10, 12, 14, 16, 18, 20};

        Arrays.sort(arr);
        Arrays.sort(brr);

        double result = findMedianSortedArrays(arr, brr);

        System.out.println(result);
    }
}
