/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 23/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Demo5 {

    public static void main(String[] args) {

        int c=0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    c++;
                    if (k>j)
                        break;
                }
            }
        }
        System.out.println(c);

    }

}
