package nag.com;

/**
 * Created by nagendra on 9/14/17.
 */
public class InterruptThread {
    public static void main(String[] args) throws InterruptedException{
        InterruptedThreadClass t = new InterruptedThreadClass();
        t.start();
        t.interrupt();
        System.out.println("main thread is started.");
    }
}

class InterruptedThreadClass extends Thread{
    public void run(){
        try{
            System.out.println("I am sleeping 2 sec.");
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("thread is interrupted.");
        }
    }
}