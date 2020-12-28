import java.util.Scanner;

public class P10_LongestDistinctCharInString {

    public static void main(String[] args) {

        // String str = "aldshflasghdfasgfkhgasdfasdgvfyweofyewyrtyefgv";
        Scanner kb = new Scanner(System.in);

        int t = kb.nextInt();

        while (t-- > 0) {
            String str = "aldshflasghdfasgfkhgasdfasdgvfyweofyewyrtyefgv";
            StringBuilder stringBuilder = new StringBuilder();

            int maxSize = 0;

            int i = 0;
            while (i < str.length()) {
                while (i < str.length() && stringBuilder.toString().indexOf(str.charAt(i)) == -1) {
                    stringBuilder.append(str.charAt(i++));
                }
                if (maxSize < stringBuilder.length())
                    maxSize = stringBuilder.length();
                stringBuilder.setLength(0);
                stringBuilder.append(i);
                i++;
            }
            System.out.println(maxSize);

        }


    }

}
