/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 28/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Demo9 {

    public static void main(String[] args) {

        String s = "ajay";

        System.out.println(s.hashCode());

        System.out.println(s.toUpperCase().hashCode());

      //  System.out.println(s.hashCode());

      //  System.out.println();



        StringBuilder sb = new StringBuilder("vijay");

        System.out.println(sb.hashCode());

        System.out.println(sb.reverse().hashCode());



    }
}
