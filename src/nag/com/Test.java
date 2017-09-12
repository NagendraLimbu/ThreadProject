package nag.com;

/**
 * Created by nagendra on 9/12/17.
 */
public class Test {
    public static void main(String[] args){
        MyThread t = new MyThread();
        t.start();
        for(int i=0; i<10;i++){
            System.out.println("a:"+i);
        }
    }
}
