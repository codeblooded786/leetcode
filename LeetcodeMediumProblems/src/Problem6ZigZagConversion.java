/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 08/07/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Problem6ZigZagConversion {

    public static String convert(String str, int numRows) {

        String result = "";

        char arr[][] = new char[numRows][10000000];

        int k = 0;
        int i = 0;
        int j = 0;

        while (k != str.length()) {
            while (i != numRows && k != str.length())
                arr[i++][j] = str.charAt(k++);
            if (k == str.length())
                break;
            i = i - 2;
            while (i != -1)
                arr[i--][++j] = str.charAt(k++);
            i = i + 2;
        }

        for (i = 0; i < numRows; i++)
            for (j = 0; j < 7; j++)
            {
                if (arr[i][j]!= ' ')
                result += arr[i][j];
            }


        return result;


    }

    public static void main(String args[]) {
        String str = "PAYPALISHIRING";
        int rows = 4;

        String result = convert(str, rows);

        System.out.println(result);
    }

}
