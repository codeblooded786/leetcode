/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 07/07/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Problem5LongestPalindromicSubstring {

    public static String longestPalindrome(String str) {


        String palindrome = "";

        for (int i = 0; i < str.length(); i++) {

            /*if (palindrome.length()>=str.substring(i).length())
                break;*/

            for (int j = str.length(); j > i; j--) {

                if (new StringBuffer(str.substring(i, j)).reverse().toString().equals(str.substring(i, j)) && str.substring(i, j).length() > palindrome.length()) {
                    palindrome = str.substring(i, j);
                    break;
                }
            }
        }

        return palindrome;


    }


    public static void main(String args[]) {
        String str = "zudfweormatjycujjirzjpyrmaxurectxrtqedmmgergwdvjmjtstdhcihacqnothgttgqfywcpgnuvwglvfiuxteopoyizgehkwuvvkqxbnufkcbodlhdmbqyghkojrgokpwdhtdrwmvdegwycecrgjvuexlguayzcammupgeskrvpthrmwqaqsdcgycdupykppiyhwzwcplivjnnvwhqkkxildtyjltklcokcrgqnnwzzeuqioyahqpuskkpbxhvzvqyhlegmoviogzwuiqahiouhnecjwysmtarjjdjqdrkljawzasriouuiqkcwwqsxifbndjmyprdozhwaoibpqrthpcjphgsfbeqrqqoqiqqdicvybzxhklehzzapbvcyleljawowluqgxxwlrymzojshlwkmzwpixgfjljkmwdtjeabgyrpbqyyykmoaqdambpkyyvukalbrzoyoufjqeftniddsfqnilxlplselqatdgjziphvrbokofvuerpsvqmzakbyzxtxvyanvjpfyvyiivqusfrsufjanmfibgrkwtiuoykiavpbqeyfsuteuxxjiyxvlvgmehycdvxdorpepmsinvmyzeqeiikajopqedyopirmhymozernxzaueljjrhcsofwyddkpnvcvzixdjknikyhzmstvbducjcoyoeoaqruuewclzqqqxzpgykrkygxnmlsrjudoaejxkipkgmcoqtxhelvsizgdwdyjwuumazxfstoaxeqqxoqezakdqjwpkrbldpcbbxexquqrznavcrprnydufsidakvrpuzgfisdxreldbqfizngtrilnbqboxwmwienlkmmiuifrvytukcqcpeqdwwucymgvyrektsnfijdcdoawbcwkkjkqwzffnuqituihjaklvthulmcjrhqcyzvekzqlxgddjoir";

        long startTime = System.currentTimeMillis();
        String result = longestPalindrome(str);
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);


        System.out.println(result);

    }


}
