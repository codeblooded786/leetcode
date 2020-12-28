/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 03/12/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class P1119_RemoveVowelsFromString {
    public String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i)) == false) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public String removeVowels2(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!vowels.contains(c + "")) {
                sb.append(s.charAt(i));
            }
            //or

            if (!vowels.contains(String.valueOf(c))) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public String removeVowels3(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) == -1) {
                sb = sb.append(c);
            }
        }

        return sb.toString();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {

        P1119_RemoveVowelsFromString p1119 = new P1119_RemoveVowelsFromString();
        System.out.println(p1119.removeVowels3("leetcodeisacommunityforcoders"));
    }
}
