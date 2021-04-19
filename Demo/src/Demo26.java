/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 29/03/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */

import java.util.LinkedList;

public class Demo26 {
    public static void main(String[] args)
            throws InterruptedException {
        // Object of a class that has both produce()
        // and consume() methods
        final PC pc = new PC();

        // Create producer thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Create consumer thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // t1 finishes before t2
        t1.join();
        t2.join();
    }

    // This class has a list, producer (adds items to list
    // and consumber (removes items).
    public static class PC {

        // Create a list shared by producer and consumer
        // Size of list is 2.
        LinkedList<Integer> hydrogen = new LinkedList<>();
        LinkedList<Integer> oxygen = new LinkedList<>();
        int capacity = 500;

        // Function called by producer thread
        public void produce() throws InterruptedException {
            int hydrogenCount = 0;
            int oxygenCount = 0;
            while (true) {
                synchronized (this) {
                    // producer thread waits while list
                    // is full
                    while (hydrogen.size() == capacity || (hydrogen.size() >= 2 && oxygen.size() >= 1))
                        wait();

                    hydrogenCount += 2;
                    oxygenCount++;

                    System.out.println("Hydrogen produced-"
                            + hydrogenCount);

                    System.out.println("Oxygen produced-"
                            + oxygenCount);
                    // to insert the jobs in the list
                    hydrogen.add(hydrogenCount);
                    oxygen.add(oxygenCount);

                    // notifies the consumer thread that
                    // now it can start consuming
                    notify();


                    Thread.sleep(5000);
                }
            }
        }

        // Function called by consumer thread
        public void consume() throws InterruptedException {
            int count = 0;
            while (true) {
                synchronized (this) {
                    // consumer thread waits while list
                    // is empty
                    while (hydrogen.size() <= 1 || oxygen.size() == 0)
                        wait();

                    // to retrive the ifrst job in the list
                    hydrogen.removeFirst();
                    hydrogen.removeFirst();
                    oxygen.removeFirst();
                    count += 1;


                    System.out.println("Consumer consumed-"
                            + count);

                    // Wake up producer thread
                    notify();

                    // and sleep
                    Thread.sleep(5000);
                }
            }
        }
    }
}