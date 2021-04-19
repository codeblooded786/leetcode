import java.util.HashMap;
import java.util.Map;

/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 17/04/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Demo30 {

    public static void main(String[] args) {

        Map<Character, Integer> matrix = new HashMap<>();

        int count = 1;

        for (int i = 65; i <= 90; i++) {
            matrix.put((char) i, count++);
        }

        String str = "BZA";
        int pointer = 1;

        int timer = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            int x = matrix.get(c) - pointer;


            int y = matrix.get('Z') - matrix.get(c) + pointer - matrix.get('A') + 1;

            timer+= Math.min(x,y);

            pointer = matrix.get(c);



        }





        System.out.println(timer);

    }
}
