import java.text.DecimalFormat;

/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 23/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Demo2 {

    int i;

    public Demo2(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        if (i == 0)
            return null;
        else return "" + i;
    }

    public static void main(String[] args) {
        Demo2 d1 = new Demo2(0);
        Demo2 d2 = new Demo2(2);

        Integer i = null;
        // String s = new String(null);

        System.out.println(d2);
        System.out.println(d1);
        System.out.println(i);
        //System.out.println(s);
    }
}
