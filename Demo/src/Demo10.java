import java.util.*;

/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 29/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Demo10 {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        List<Integer> integerList1 = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>();

        Set s = new HashSet();
        Set d = new TreeSet();

        d.add("abc");
        d.add(new StringBuffer("abcs"));

        for (Object ad:d) {
            System.out.println(ad);
        }


   //     System.out.println(map.size());
      //  System.out.println(map.entrySet().size());
    }
}
