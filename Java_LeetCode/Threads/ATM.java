package Threads;

/**
 * @author - yogesh
 */
class Money{
    int money = 0;
    void deposit(){
        money++;
    }
    void withdraw(){
        money--;
    }
}

/**
Single thread synchronized
 **/
public class ATM {
    public static void main(String[] args) throws Exception{
        Money mObj = new Money();
        Thread atmthread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    mObj.deposit();
                    System.out.println("Accessed & increment by child thread");
                }
            }
        });


        atmthread.start();
        atmthread.join(); // makes main wait until atmthread completed
        System.out.println("Accessed by main: "+mObj.money);


    }
}
