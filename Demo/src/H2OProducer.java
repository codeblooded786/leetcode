import java.util.concurrent.TimeUnit;

/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 29/03/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */

//
//Problem statement Write a Java program that simulates a Water manufacturing factory. Your factory has infinitely capable Hydrogen and Oxygen producer units (independent units) provided free of charge by the government. Your pipeline (or consumer) should consume 2 atoms of Hydrogen and one atom of Oxygen to generate one molecule of Water. There are 3 things to note
//        1. No wastage of Hydrogen or Oxygen
//        2. The size of the pipes that take the output of both the Hydrogen and Oxygen producers is limited in length and can hold only 500 atoms at a time.
//        3. The pipeline consumer that combines Hydrogen and Oxygen will take 5 seconds to generate 1 molecule of Water. Write a multi-threaded program to simulate the producer and consumer. Your factory’s output should be 10 molecules of Water per second.
//
//class Water implements Runnable {
//
//    private volatile int hydrogen = 500;
//    private volatile int oxygen = 500;
//    private static volatile int waterMolecule = 0;
//
//
//    @Override
//    public void run() {
//
//        makeWaterMolecule();
//    }
//
//    private synchronized void makeWaterMolecule()
//    {
//        if (hydrogen >= 2 && oxygen >= 1) {
//            hydrogen = hydrogen - 2;
//            oxygen = oxygen - 1;
//          //  Thread.sleep(TimeUnit.SECONDS.toSeconds(5));
//            waterMolecule++;
//            System.out.println(waterMolecule);
//        }
//    }
//
//
//}
//
//
//public class Demo25 {
//
//    public static void main(String[] args) {
//
//        for (int i = 1; i <= 10; i++) {
//
//            Runnable molecule = new Water();
//            Thread t1 = new Thread(molecule);
//            t1.start();
//
//        }
//    }
//}


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class H2OProducer {
    static Lock lock = new ReentrantLock(true);
    static Condition condition = lock.newCondition();

    public static void main(String[] args) {
        try {
            Thread h1 = new Thread(() -> {
                try {
                    hydrogenProducer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            Thread h2 = new Thread(() -> {
                try {
                    hydrogenProducer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            Thread o = new Thread(() -> {
                try {
                    hydrogenProducer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            h1.start();
            h2.start();
            o.start();

            try {
                h1.join();
                h2.join();
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
        }

    }

    public static void hydrogenProducer() throws InterruptedException {
        try {
            lock.lock();
            System.out.println("h");
            condition.signalAll();
      
        } finally {
            lock.unlock();
        }

    }

    public static void oxygenProducer() throws InterruptedException {
        try {
            lock.lock();
            System.out.println("o");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}