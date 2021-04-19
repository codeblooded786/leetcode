/**
 * @project leetcode
 * Created by @author Rahul Dev Gupta on 12/01/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class RaceConditionDemo {

    public static void main(String[] args) {
        BankAccount task = new BankAccount();
        task.setAmount(100);

        Thread john = new Thread(task);
        Thread anita = new Thread(task);
        john.setName("john");
        anita.setName("anita");
        john.start();
        anita.start();

    }
}

class BankAccount implements Runnable {
    private int amount;

    public synchronized int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void run() {
        makeWithdrawal(75);
        if (this.amount < 0) {
            System.out.println("Amount overdrawn");
        }
    }

    public synchronized void makeWithdrawal(int amount) {
        if (this.amount >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing the amount");
            this.amount -= amount;
            System.out.println(Thread.currentThread().getName() + " has withdrawn the amount");
        } else {
            System.out.println("Insufficient Funds");
        }
    }
}