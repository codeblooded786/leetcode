import java.util.*;
import java.util.stream.Collectors;

/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 19/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Demo2 {


    public static void main(String[] args) {
        //Intergerarray<arraylist>=[1 2 3 4 1 3 4 5 7 8 9 6 3];


        Integer array[] = {1, 2, 3, 4, 1, 3, 4, 5, 7, 8, 9, 6, 3};
        List<Integer> integerList = Arrays.asList(array);

        Map<Integer, Integer> matrix = new HashMap<>();


        for (Integer i : integerList) {
            if (matrix.containsKey(i)) {
                matrix.put(i, matrix.get(i) + 1);
            } else {
                matrix.put(i, 1);
            }
        }


        for (Map.Entry<Integer, Integer> entry : matrix.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

        //Set<Integer> set = new HashSet<>(integerList);

        //List<Integer> uniqueList = set.stream().collect(Collectors.toList());


//        for (Integer i : uniqueList)
//            System.out.println(i);
    }
}
