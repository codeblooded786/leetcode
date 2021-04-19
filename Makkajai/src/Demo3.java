/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 19/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */

import java.util.*;
public class Demo3 {
    public static void main(String args[]) {

        // Declaration of String ArrayList
        ArrayList<String> al = new ArrayList<String>();

       /* Simple add() method for adding element
          at the end of the ArrayList */
        al.add("California");
        al.add("Boston");
        al.add("San jose");
        al.add("New York");

        al.add(0, "Texas");
        al.add(3, "San Francisco");

        for (String s: al) {
            System.out.println(s);
        }
        //   2->San Francisco
        // and 0->Texas
    }
}