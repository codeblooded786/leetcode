/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 04/12/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class P1662 {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String s : word1) {
            sb1.append(s);
        }
        for (String s : word2) {
            sb2.append(s);
        }

        return sb1.toString().equals(sb2.toString());

    }

    public static void main(String[] args) {
        P1662 p1662 = new P1662();
        System.out.println(p1662.arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"}));
    }
}
