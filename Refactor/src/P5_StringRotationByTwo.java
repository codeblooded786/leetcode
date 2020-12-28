import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class P5_StringRotationByTwo {

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

    private static boolean isRotated(String s1, String s2) {
        //     String clockwise = s1.substring(2).concat(s1.substring(0, 2));
        //     String antiClockwise = s1.substring(s1.length()-2).concat(s1.substring(0,s1.length()-2));
        if (s1.length() == 1 || s1.length() == 2) {
            return (s1.equals(s2));
        }

        return s1.substring(2).concat(s1.substring(0, 2)).equals(s2) || s1.substring(s1.length() - 2).concat(s1.substring(0, s1.length() - 2)).equals(s2);

    }

    public static void main(String[] args) {

        FastReader kb = new FastReader();

        PrintWriter out = new PrintWriter(System.out);

        out.println(isRotated("amazon", "azonam"));
        out.flush();
        out.close();

    }
}
