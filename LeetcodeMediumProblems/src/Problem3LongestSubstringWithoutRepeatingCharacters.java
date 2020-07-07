import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 07/07/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Problem3LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String str) {

        int i, j;
        i = 0;
        j = 1;
        int size = 0;
        int max = 0;

        if (str.length() == 0)
            return 0;
        else if (str.length() == 1)
            return 1;

        while (j != str.length()) {
            if (str.substring(i, j).indexOf(str.charAt(j)) == -1) {
                j++;
                size = str.substring(i, j).length();
                if (size > max)
                    max = size;
            } else {
                i = str.substring(0, i).length() + str.substring(i, j).indexOf(str.charAt(j)) + 1;
            }

        }
        return max;
    }


    public static void main(String args[]) {
        String str = "";
        int result = lengthOfLongestSubstring(str);
        System.out.println(result);
    }
}
