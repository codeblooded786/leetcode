//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
///**
// * @project leetcode
// * Created by @author Rahul Dev Gupta on 16/01/21
// * Time Complexity: O()    |   Auxiliary Space: O()
// */
//
////Have the function CamelCase(str) take the str parameter being passed and return it in proper camel case format where the first letter of each word is capitalized (excluding the first letter). The string will only contain letters and some combination of delimiter punctuation characters separating each word.
////
////        For example: if str is "BOB loves-coding" then your program should return the string bobLovesCoding.
////        Examples
////        Input: "cats AND*Dogs-are Awesome"
////        Output: catsAndDogsAreAwesome
////        Input: "a b c d-e-f%g"
////        Output: aBCDEFG
//
//public class CamerCase {
//    public static String CamelCase(String str) {
//        // code goes here
//        int i = 0;
//        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXWZ";
//        List<String> stringList = new ArrayList<>();
//        while (i < str.length()) {
//            int k = i;
//            while (i < str.length() && s.indexOf(str.charAt(i)) != -1) {
//                i++;
//            }
//
//            stringList.add(str.substring(k, i));
//            i++;
//            Integer.toString();
//
//        }
//
//        StringBuilder camelCase = new StringBuilder();
//
//        if (stringList.size() > 0) {
//            stringList.set(0, stringList.get(0).toLowerCase());
//            camelCase.append(stringList.get(0));
//        }
//
//
//        for (int j = 1; j < stringList.size(); j++) {
//            String p = stringList.get(j);
//            if (p.length() > 1) {
//                camelCase.append(p.substring(0, 1).toUpperCase().concat(p.substring(1).toLowerCase()));
//            } else {
//                camelCase.append(p.substring(0, 1).toUpperCase());
//            }
//
//        }
//
//        return camelCase.toString();
//    }
//
////    Input: "cats AND*Dogs-are Awesome"
////    Output: catsAndDogsAreAwesome
////    Input: "a b c d-e-f%g"
////    Output: aBCDEFG
//
//    public static void main(String[] args) {
//        // keep this function call here
//        //Scanner s = new Scanner(System.in);
//        System.out.print(CamelCase("caTs AND*Dogs-are Awesome"));
//
//
//    }
//
//    char[] number = (n + "").toCharArray();
//
//    int i, j;
//    // I) Start from the right most digit and
//    // find the first digit that is
//    // smaller than the digit next to it.
//        for (i = number.length-1; i > 0; i--)
//            if (number[i-1] < number[i])
//            break;
//
//    // If no such digit is found, its the edge case 1.
//        if (i == 0)
//            return -1;
//
//    // II) Find the smallest digit on right side of (i-1)'th
//    // digit that is greater than number[i-1]
//    int x = number[i-1], smallest = i;
//        for (j = i+1; j < number.length; j++)
//            if (number[j] > x && number[j] <= number[smallest])
//    smallest = j;
//
//    // III) Swap the above found smallest digit with
//    // number[i-1]
//    char temp = number[i-1];
//    number[i-1] = number[smallest];
//    number[smallest] = temp;
//
//    // IV) Sort the digits after (i-1) in ascending order
//        Arrays.sort(number, i, number.length);
//
//    long val = Long.parseLong(new String(number));
//        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
//
//}
