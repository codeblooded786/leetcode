/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 23/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class CrazyMath {

    public static void main(String[] args) {

        int x = 10, y = 20;
        int dx, dy;

        try {
            dx = x % 5;//0
            dy = y / dx;//
        } catch (ArithmeticException ae) {
            System.out.println("Caught AE");
            dx = 2;
            dy = y / dx;//10
        }
        x = x / dx;//5
        y = y / dy;//2

        System.out.println(dx + " " + dy);
        System.out.println(x + " " + y);
    }

}
