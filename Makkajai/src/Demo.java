import java.io.IOException;

/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 18/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */


class A {
    public void m1() throws IOException, Exception {
        System.out.println("Parent Class A");
    }
}

class B extends A {
    public void m1() throws Exception {
        System.out.println("Parent Class B");
    }
}

public class Demo {
    public static void main(String[] args) {
        try {
            A a = new A();
            a.m1();
            A b = new B();
            b.m1();
        } catch (Exception e) {
        }
    }
}