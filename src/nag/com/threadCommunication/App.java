package nag.com.threadCommunication;

/**
 * Created by nagendra on 9/18/17.
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();
        Thread.sleep(1000);
        synchronized (b){
            System.out.println("main method is waiting child");
            b.wait(1000);
            System.out.println("main method is notified.");
        }
        System.out.println(b.total);
    }
}
