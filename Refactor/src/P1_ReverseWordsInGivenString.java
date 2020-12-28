import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class P1_ReverseWordsInGivenString {

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

    public static String reverseString(String stringToBeReversed) {
        String[] stringArray = stringToBeReversed.split("\\.");

        StringBuilder result = new StringBuilder();

        for (int i = stringArray.length - 1; i >= 0; i--) {
            result.append(stringArray[i] + ".");
        }

        return result.substring(0, result.length() - 1);

    }

    public static String reverseStringUsingStack(String stringToBeReversed) {
        String[] stringArray = stringToBeReversed.split("\\.");
        Stack<String> stringStack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < stringArray.length; i++) {
            stringStack.push(stringArray[i]);
        }

        while (!stringStack.isEmpty()) {
            result.append(stringStack.pop() + ".");
        }

        return result.substring(0, result.length() - 1);
    }

    public static void main(String[] args) {

        FastReader kb = new FastReader();
        String stringToBeReversed = kb.nextLine();


        PrintWriter out = new PrintWriter(System.out);
        out.println(reverseString(stringToBeReversed));
        out.flush();
        out.close();

    }
}
