/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 01/02/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
class A {


//   void m1()
//   {
//       System.out.println("Inside m1");
//   }
}

class B extends A {

    void m1() {
        System.out.println("Inside m2");
    }
}

public class Demo12 {
    public static void main(String[] args) {

        A a = new B();
        ((B) a).m1();
    }
}
