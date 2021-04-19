import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 01/02/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Demo11 {



    public Map countNumbers(List<Integer> integers)
    {
        Map<Integer, Integer> matrix = new HashMap<>();

        for (Integer i: integers) {

            if (matrix.containsKey(i))
            {
                matrix.put(i,matrix.get(i)+1);
            }
            else
            {
                matrix.put(i,1);
            }
        }
        return matrix;
    }




    public static void main(String[] args) {




    }


}
