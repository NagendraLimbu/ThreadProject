package nag.com;

/**
 * Created by nagendra on 9/14/17.
 */
public class JoinThread {
    public static void main(String[] args) throws InterruptedException{
        MyJoinThread.mt = Thread.currentThread();

        MyJoinThread t = new MyJoinThread();
        /*child thread starts*/
        t.start();
        System.out.println("main Thread");
    }

}

class MyJoinThread extends Thread{
    static Thread mt;
    public void run(){
        try{
            /*when child thread starts. main thread will be run until its task is finished
            and then child tas will be run */
            mt.join();
        }catch (InterruptedException e){

        }
        System.out.println("child htread");
    }
}