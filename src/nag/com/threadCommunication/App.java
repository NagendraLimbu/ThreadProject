package nag.com.threadCommunication;

/**
 * Created by nagendra on 9/18/17.
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        b.start();
        synchronized (b){
            System.out.println("main method is waiting child");
            b.wait();
            System.out.println("main method is notified.");
        }
        System.out.println(b.total);
    }
}
