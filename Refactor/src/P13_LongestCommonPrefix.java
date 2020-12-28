import java.util.Arrays;
import java.util.Scanner;

public class P13_LongestCommonPrefix {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int t = kb.nextInt();

        while (t-- > 0) {
            int n = kb.nextInt();
            String stringArray[] = new String[n];
            String smallestString = null;

            for (int i = 0; i < n; i++) {
                stringArray[i] = kb.next();
                if (smallestString == null || stringArray[i].length() < smallestString.length()) {
                    smallestString = stringArray[i];
                }
            }

            final String small = smallestString;
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < smallestString.length(); i++) {
                final int temp = i;
                if (Arrays.stream(stringArray).anyMatch(s -> s.charAt(temp) != small.charAt(temp)))
                    break;
                ans.append(small.charAt(i));
            }
            if (ans.length() > 0) {
                System.out.println(ans);
            } else {
                System.out.print(-1);
            }
        }
    }
}
