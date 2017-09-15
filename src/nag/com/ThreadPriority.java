package nag.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nagendra on 9/14/17.
 */
public class ThreadPriority extends Thread {
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getPriority()); // default priority of main is 5
//        Thread.currentThread().setPriority(11); // throw IllegalArgumentException becouse  arg should be(0-10)

        // inherit priority
        Thread.currentThread().setPriority(7);
        ThreadPriority t = new ThreadPriority();
        System.out.println(t.getPriority()); // print 7

        /*This is example of child thread and parent priority*/
        MyThreadPriority mtp = new MyThreadPriority();

        // if child thread is not  set to 10. main and child both will have priority 10 and we can't guess o/p.
//        mtp.setPriority(10); // child thread priority is 10.
        mtp.start();          // main thread priority is 5. So, first child run then main will run

        List<Integer> values = new ArrayList<>(Arrays.asList(1,3,4,2,6));
        values.forEach(System.out::println);
    }
}

class MyThreadPriority extends Thread{
    public void run(){
        for(int i=0; i<10;i++){
            System.out.println("child thread"+i);
        }
    }
}
