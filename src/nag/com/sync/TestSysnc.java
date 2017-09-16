package nag.com.sync;

/**
 * Created by nagendra on 9/15/17.
 */
public class TestSysnc {
    public static void main(String[] args){
        Display d = new Display();
        Display d2 = new Display();
        MyThread t1 = new MyThread(d,"nagendra");
        MyThread t2 = new MyThread(d2,"Raju");
//        t2.start();
        t1.start();;
        t2.start();
    }
}
