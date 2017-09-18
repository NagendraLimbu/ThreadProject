package nag.com.threadCommunication;

/**
 * Created by nagendra on 9/18/17.
 */
public class ThreadB extends Thread {
    int total = 0;
    public void run(){
        synchronized (this){
            System.out.println("child thread after wait() method called");
            for(int i=0; i<10;i++){
                total = total+i;
            }
            System.out.println("child is notifying to main method.");
            this.notify();
        }
    }
}
