package nag.com.daemonThread;

import nag.com.threadCommunication.ThreadB;

/**
 * Created by nagendra on 9/19/17.
 */
public class DaemonThreadTerminationTest  {
    public static void main(String[] args){
        MyThreadDaemon t = new MyThreadDaemon();
//        t.setDaemon(true);
        t.start();
        System.out.println("main Thread.");
    }
}

class MyThreadDaemon extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("child thread");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}