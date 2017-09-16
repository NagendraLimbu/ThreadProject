package nag.com.sync;

/**
 * Created by nagendra on 9/15/17.
 */
public class Display {
    public synchronized void wish(String name){
        try {
            System.out.println("Good Morning: ");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name);
    }
}

class MyThread extends Thread{
    Display d;
    String name;

    public MyThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run(){
        for(int i=0; i<5;i++)
        d.wish(name);
    }
}
