/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 12/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class MySecondThread {

    public static void main(String[] args) {

        Thread emailCampaign = new Thread(new EmailCampaign());
        Thread dataAggregator = new Thread(new DataAggregator());

        emailCampaign.setName("Email Campaign");
        dataAggregator.setName("Data Aggregator");

        emailCampaign.setPriority(Thread.MAX_PRIORITY);
        dataAggregator.setPriority(Thread.MIN_PRIORITY);

        emailCampaign.start();
        dataAggregator.start();

        try {
            // main thread is suspended until dataAggregator thread dies
            //dataAggregator.join();
            dataAggregator.join(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("In main thread");

    }
}


class EmailCampaign implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            if (i == 5) {
                // Hints the scheduler that thread is willing to
                // yield its current use of CPU
                Thread.yield();
            }
        }
    }
}

class DataAggregator implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}