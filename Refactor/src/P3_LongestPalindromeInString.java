import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class P3_LongestPalindromeInString {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    private static boolean isPalindrome(String string) {
        return string.equals(new StringBuilder(string).reverse().toString());
    }

    public static String findLongestPalindromeI(String str) {
        int lengthOfString = str.length();
        while (lengthOfString > 0) {
            for (int i = 0; i + lengthOfString <= str.length(); i++) {
                String subString = str.substring(i, i + lengthOfString);

                if (isPalindrome(subString)) {
                    return subString;
                }
            }
            lengthOfString--;
        }

        throw new IllegalArgumentException("No answer");
    }

    public static String findLongestPalindromeON2(String string) {
        int length = string.length();

        String lps = "";

        for (int i = 0; i < length; i++) {
            String odd = expandPalindrome(string, i, i);
            String even = expandPalindrome(string, i, i + 1);

            if (odd.length() > lps.length()) {
                lps = odd;
            }
            if (even.length() > lps.length()) {
                lps = even;
            }
        }
        return lps;
    }

    private static String expandPalindrome(String string, int l, int r) {
        while (l >= 0 && r < string.length() && string.charAt(l) == string.charAt(r)) {
            l--;
            r++;
        }
        return string.substring(l + 1, r);

    }


    public static void main(String[] args) {

        FastReader kb = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = kb.nextInt();

        while (t-- > 0) {
            String str = kb.next();
            out.println(findLongestPalindromeON2("aaaabbaa"));
        }

        out.flush();
        out.close();
    }
}
