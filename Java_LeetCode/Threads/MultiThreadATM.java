package Threads;

/**
 * @author - yogesh
 */
class MultiMoney{
    int money = 0;
    void deposit(){money++;}

}
public class MultiThreadATM {
    public static void main(String[] args) throws Exception{
        MultiMoney multiMoney = new MultiMoney();
        Thread t1 = new Thread(new Runnable(){
        public void run(){
                for (int i = 0; i < 5; i++) {
                    multiMoney.deposit();
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
            public void run(){
                for (int i = 0; i < 5; i++) {
                    multiMoney.deposit();
                }
            }
        });

        t1.start();
        t2.start();

        t2.join();
        t1.join();

        System.out.println("Main thread result: "+multiMoney.money);
    }
}
