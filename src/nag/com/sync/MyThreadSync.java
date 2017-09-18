package nag.com.sync;

/**
 * Created by nagendra on 9/16/17.
 */
public class MyThreadSync extends Thread {

    Display1 d;

    public MyThreadSync(Display1 d) {
        this.d = d;
    }

    public void run(){
        d.displayNumber();
    }
}

class MyThread2 extends Thread{

    Display1 d;

    public MyThread2(Display1 d) {
        this.d = d;
    }

    public void run(){
        d.displayChar();
    }
}
