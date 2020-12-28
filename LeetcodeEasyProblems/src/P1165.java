/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 04/12/20
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class P1165 {

    public int calculateTime(String keyboard, String word) {
        int time = 0;
        int begin = 0;
        int end;
        for (int i = 0; i < word.length(); i++) {
            end = keyboard.indexOf(word.charAt(i));
            time += Math.abs(end - begin);
            begin = end;
        }
        return time;
    }

    public static void main(String[] args) {
        P1165 p1165 = new P1165();
        System.out.println(p1165.calculateTime("abcdefghijklmnopqrstuvwxyz", "cba"));
    }
}
