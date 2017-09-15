package nag.com;

import sun.rmi.server.InactiveGroupException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nagendra on 9/14/17.
 */
public class ThreadYield {
    public static void main(String[] args){
        YieldThread t = new YieldThread();
        t.start();
        List<Integer> values = new ArrayList<Integer>(Arrays.asList(1,3,4,6));
        values.forEach(System.out::println);
    }
}

class YieldThread extends Thread{
    public void run(){
        List<Integer> list = new ArrayList<>(Arrays.asList(10,11,12,13));
        for(Integer i: list){
            System.out.println(i);
            Thread.yield();
        }
    }
}
