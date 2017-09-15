package nag.com;

/**
 * Created by nagendra on 9/12/17.
 */
public class OverLoadedMyThread extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("child method");
        }
    }

    public void run(int k){
        for(int i=0; i<10; i++){
            System.out.println("child method: "+k);
        }
    }

    /*
    * Thread class constructors
    *
    * Thread t = new Thread();
    * Thread t = new Thread(Runnable r);
    * Thread t = new Thread(Runnable r, String name);
    * Thread t = new Thread(ThreadGroup g, String name);
    * Thread t = new Thread(ThreadGroup g, Runnable r);
    * Thread t = new Thread(ThreadGroup g, Runnable r, String name);
    * Thread t = new Thread(ThreadGroup g, Runnable r, String name, Long stackSize);
    * */
}
