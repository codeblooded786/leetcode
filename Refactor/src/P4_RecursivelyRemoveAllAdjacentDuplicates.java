import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P4_RecursivelyRemoveAllAdjacentDuplicates {

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

    private static String removeAdjacentDuplicates(String string) {

        StringBuilder stringBuilder = new StringBuilder(string);

        int oldlength = stringBuilder.length();
        boolean flag = false;
        while (true) {
            int i = 0;
            while (i < stringBuilder.length()) {

                while (i + 1 < stringBuilder.length() && stringBuilder.charAt(i) == stringBuilder.charAt(i + 1)) {
                    stringBuilder.deleteCharAt(i);
                    stringBuilder.deleteCharAt(i);
                    flag = true;
                }
                if (flag == false) {
                    i++;
                }
            }
            if (oldlength == stringBuilder.length()) {
                break;
            }

            if (oldlength != stringBuilder.length()) {
                oldlength = stringBuilder.length();
            }

        }

        return stringBuilder.toString();
    }

    static void removeDuplicates(char[] S) {
        int n = S.length;

        // We don't need to do anything for
        // empty or single character string.
        if (n < 2) {
            return;
        }

        // j is used to store index is result
        // string (or index of current distinct
        // character)
        int j = 0;

        // Traversing string
        for (int i = 1; i < n; i++) {
            // If current character S[i]
            // is different from S[j]
            if (S[j] != S[i]) {
                j++;
                S[j] = S[i];
            }
        }
        System.out.println(Arrays.copyOfRange(S, 0, j + 1));
    }

    public static void main(String[] args) {
        FastReader kb = new FastReader();

        PrintWriter out = new PrintWriter(System.out);


        out.println(removeAdjacentDuplicates("acaaabbbacdddd"));
        //  removeDuplicates("azxxzy".toCharArray());

        out.flush();
        out.close();
    }
}
