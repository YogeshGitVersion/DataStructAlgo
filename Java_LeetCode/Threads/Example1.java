package Threads;

/**
 * @author - yogesh
 */

class ThreadCounter extends Thread{
    int count=0;
    void increment(){count++;}
    public void run(){
        increment();
        System.out.println("Self thread value of count: "+count);
    }

}

public class Example1  {
    public static void main(String[] args) {
        ThreadCounter th = new ThreadCounter();
        th.start();


        System.out.println("Completed");
        System.out.println("Main thread value of count: "+th.count);
    }
}
