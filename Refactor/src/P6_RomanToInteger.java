import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P6_RomanToInteger {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        Map<Character, Integer> matrix = new HashMap<>();
        matrix.put('I', 1);
        matrix.put('V', 5);
        matrix.put('X', 10);
        matrix.put('L', 50);
        matrix.put('C', 100);
        matrix.put('D', 500);
        matrix.put('M', 1000);
        //  String s = kb.next();
        String str = "LVIII";

        int ans = 0;
        int temp = 0;
        int arr[] = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = matrix.get(str.charAt(i));
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                ans += arr[i];
            } else {
                ans -= arr[i];
            }
        }

        System.out.println(ans + arr[arr.length - 1]);
    }
}
