package nag.com.daemonThread;

/**
 * Created by nagendra on 9/19/17.
 */
public class DeamonThreadTest {
    public static void main(String[] args){
        System.out.println(Thread.currentThread().isDaemon());  // fasle
//        Thread.currentThread().setDaemon(true); // IlligalThreadSetException
        MyThread t = new MyThread();
        System.out.println(t.isDaemon()); // false
        t.setDaemon(true);
        System.out.println(t.isDaemon()); // true
    }
}

class MyThread extends Thread{
    public void run(){

    }
}
