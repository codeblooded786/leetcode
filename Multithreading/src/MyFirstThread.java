/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 11/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class MyFirstThread {

    public static void main(String[] args) {

        Task task = new Task();
        Thread thread = new Thread(task); // New
        thread.start(); //Runnable
        System.out.println("Inside main");
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
    }
}
