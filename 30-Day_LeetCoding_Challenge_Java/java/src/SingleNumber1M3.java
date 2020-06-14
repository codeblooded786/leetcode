import sun.security.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SingleNumber1M3 {

    public static int singleNumber(int arr[]) {
        //List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
        List<Integer> list1 = Arrays.stream(arr).boxed().collect(Collectors.toList()); //Approach 1
        /*List<Integer> list2 = new ArrayList<>();    //Approach 2
        Collections.addAll(list2,Arrays.stream(arr).boxed().toArray(Integer[]::new));*/
        /*IntStream.of(arr).boxed().collect(Collectors.toList()); // Approach 3*/

        Set<Integer> set = new HashSet<Integer>(list1);
        int sumOfSet = 0, sumOfArray = 0;
        for (int x : set) {
            sumOfSet += x;
        }
        for (int x : arr) {
            sumOfArray += x;
        }
        return 2 * sumOfSet - sumOfArray;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 1, 2, 3};

        int x = SingleNumber1M3.singleNumber(arr);

        System.out.println(x);

    }


}



