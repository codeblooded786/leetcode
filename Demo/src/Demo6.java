import sun.util.locale.LocaleMatcher;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 23/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Demo6 {

    public static void main(String[] args) {

//        int scores1[] = {1, 2, 3, 4, 5, 6};
//        int scores2[] = null;
//
//        System.arraycopy(scores1, 2, scores2, 0, 2);

        int x = 1___3;
        ;
        ;
        ;
        ;
        ;
        ;
        long y = 1_3;
        float z = 3.234_567f;

        System.out.println(x + " " + y + " " + z);

        Locale locale = new Locale("en", "US");

        ResourceBundle rb = ResourceBundle.getBundle("test.MyBundle", locale);

        //  String obj = rb.getObject("key1");
        Object object = rb.getObject("key1");
        String[] values = rb.getStringArray("key2");
        // Object obj = rb.getValue("key3");

        Locale locale1 = Locale.getDefault();
        Locale myLocale = Locale.US;
        Locale locale2 = new Locale("ru", "RU");
        //Locale locale3 = Locale.getInstance();

//        for (int i : &nbsp; scores2)
//        {
//            System.out.println(i);
//        }

    }

}
