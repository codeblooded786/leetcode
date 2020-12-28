import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class P8_RemoveDuplicates {

    public static String removeDuplicates(String str) {
        //Map<Character, Integer> matrix = new LinkedHashMap<>();
        List<Character> characterList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (!characterList.contains(str.charAt(i))) {
                characterList.add(str.charAt(i));
            }
            if (characterList.size() == 26) {
                break;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (Character ch :
                characterList) {
            stringBuilder.append(ch);

        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {

        String str = "geeksforGeeks";

        String lowerCase = str.toLowerCase();

        System.out.println(removeDuplicates(lowerCase));

    }
}
