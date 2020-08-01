/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 01/08/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Day1DetectCapital {

    public static Boolean detectCapital(String string) {
        int countCapital = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 65 && string.charAt(i) <= 90)
                countCapital++;
        }

        if (countCapital == 0 || countCapital == string.length() || (countCapital == 1 && string.charAt(0) >= 65 && string.charAt(0) <= 90))
            return Boolean.TRUE;

        return Boolean.FALSE;
    }

    public static void main(String args[]) {
        String string = "Google";
        Boolean result = detectCapital(string);
        System.out.println(result);
    }
}
