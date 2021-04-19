import java.util.concurrent.TimeUnit;

/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 11/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class MyFirstThread2 extends Thread{

    public void run()
    {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread2 = new MyFirstThread2();
        thread2.start();
       // Thread.sleep(3000);//3000 milliseconds or 3 seconds
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Inside main");
    }
}
