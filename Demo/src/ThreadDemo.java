/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 23/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
class Thread1 implements Runnable{

    int counter;

    @Override
    public void run() {
        System.out.println(counter++);
    }
}
public class ThreadDemo
{

    public static void main(String[] args) {


        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread1());

        t1.start();
        t2.start();

    }

}