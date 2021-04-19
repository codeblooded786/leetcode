/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 20/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Power {

    public static void main(String[] args) {
        int a =3;
        int b =5;

        int power = calculatePower(a,b);

        System.out.println(power);
    }

    private static int calculatePower(int a, int b) {
        int power=1;

        for (int i = 1; i <= b; i++) {
            power=power*a;
        }
        return power;
    }

}
