package Threads;

/**
 * @author - yogesh
 */
class AtmDeadlock {
    int money = 100;
    public synchronized void credit(){money+=1;}
    public synchronized void debit(){money-=1;}
    public synchronized int getBalance(){return money;}
    public synchronized void method1(AtmDeadlock other){other.method2(this);};
    public synchronized void method2(AtmDeadlock other){other.method1(this);};

}

public class DeadLock {
    public static void main(String[] args) throws Exception{
        AtmDeadlock atm2 = new AtmDeadlock();
        AtmDeadlock atm3 = new AtmDeadlock();
        /*
        user1 calls method1 with atm2 as resource and
        user2 calls method2 with atm3 as resource
        Both methods subsequently attempt to acquire locks on the other resource,
        leading to a potential deadlock situation.
         */

        Thread user1 = new Thread(()-> atm2.method1(atm2));
        Thread user2 = new Thread(()-> atm3.method2(atm3));

        user1.start();
        user2.start();

        user1.join();
        user2.join();


        System.out.println("Final money: "+ atm3.money);
        System.out.println("Final money: "+ atm2.money);

    }
}




