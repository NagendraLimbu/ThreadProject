package nag.com.sync;

/**
 * Created by nagendra on 9/16/17.
 */
public class TestRun {
    public static void main(String[] args){
        Display1 d = new Display1();
        MyThreadSync t1 =new MyThreadSync(d);
        MyThread2 t2 = new MyThread2(d);
        t1.start();
        t2.start();
    }
}
