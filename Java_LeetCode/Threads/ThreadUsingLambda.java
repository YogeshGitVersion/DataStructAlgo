package Threads;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author - yogesh
 */

class ATM2{
    int money = 0;
    void deposit(){money++;}
}
public class ThreadUsingLambda {
    public static void main(String[] args) throws Exception {

        ATM2 atm = new ATM2();

        //lambda for thread
        Thread th = new Thread(()->{
            System.out.println("Access from Thread class thread: "+atm.money);
            atm.deposit();
        });

        th.start();
        th.join();

        Runnable r1 = ()->{
            //implement operation for thread
            System.out.println("Access from runnable thread: "+atm.money);
            atm.deposit();
        };
        Thread t1 = new Thread(r1);
        t1.start();
        t1.join();


        System.out.println("Access from main thread: "+atm.money);



        //map

        List<String> names = Arrays.asList("Harish","Yogesh","Arlington");
        names = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(names+" really ");

    }

}


