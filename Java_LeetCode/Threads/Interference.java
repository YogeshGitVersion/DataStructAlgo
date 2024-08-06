package Threads;

/**
 * @author - yogesh
 */
class InteferenceATM {
    int money = 100;
    public synchronized void credit(){money+=1;}
    public synchronized void debit(){money-=1;}
    public synchronized int getBalance(){return money;}

}
public class Interference {
    public static void main(String[] args) throws Exception{
        InteferenceATM inteferenceAtm = new InteferenceATM();


        Runnable task = ()->{
            for (int i = 0; i < 10; i++) {
                inteferenceAtm.money++;
                System.out.println("Accessing...: "+Thread.currentThread().getName());
            }
        };

        /**
         * Each thread access the resources concurrently.
         */
        Thread user1 = new Thread(task);
        Thread user2 = new Thread(task);

        user1.start();
        user2.start();

        user1.join();
        user2.join();

        System.out.println("Final money: "+ inteferenceAtm.money);

    }
}
