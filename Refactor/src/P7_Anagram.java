import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P7_Anagram {


    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;
//

        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i=0;i<arr1.length;i++)
        {
            if (arr1[i]!=arr2[i])
                return false;
        }
//        Map<Character, Integer> matrix1 = new HashMap<>();
//        Map<Character, Integer> matrix2 = new HashMap<>();
//
//        for (int i = 0; i < s1.length(); i++) {
//            if (matrix1.containsKey(s1.charAt(i))) {
//                matrix1.put(s1.charAt(i), matrix1.get(s1.charAt(i)) + 1);
//            } else {
//                matrix1.put(s1.charAt(i), 0);
//            }
//
//            if (matrix2.containsKey(s2.charAt(i))) {
//                matrix2.put(s2.charAt(i), matrix2.get(s2.charAt(i)) + 1);
//            } else {
//                matrix2.put(s2.charAt(i), 0);
//            }
//        }

//        for (Map.Entry<Character, Integer> entry : matrix1.entrySet()) {
//            if (!matrix2.containsKey(entry.getKey()) || matrix2.get(entry.getKey()) != entry.getValue()) {
//                return false;
//            }
//        }



        return true;
    }


    public static void main(String[] args) {

        java.util.Scanner kb = new java.util.Scanner(System.in);

        String s1 = kb.next();
        String s2 = kb.next();


    }
}
